package dom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BiblioToXhtmlDom {
	private Document outHTML = null;
	private NodeList conferences = null;
	
	public static void main(String args[]) {
		String xmlPath = System.getProperty("user.dir") + "/TALN-RECITAL-BIB.xml";
		String htmlPath = System.getProperty("user.dir") + "/output.html";
		BiblioToXhtmlDom biblioToXhtmlDom = new BiblioToXhtmlDom();
		try {
			biblioToXhtmlDom.setXml(xmlPath);
			biblioToXhtmlDom.createDoc();
			biblioToXhtmlDom.createHTML();
			biblioToXhtmlDom.createDivIndex();
			biblioToXhtmlDom.createDivDetail();
			biblioToXhtmlDom.DocumentToString(htmlPath);
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println("ERREUR de parse XML" + e.getMessage());
			e.printStackTrace();
		}
		
	}
	/**
	 * définie le document xml source
	 * @param xmlPath chemain du xml a parser
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 * 
	 */
	public void setXml(String xmlPath) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File(xmlPath));
		this.conferences = doc.getElementsByTagName("conferences").item(0).getChildNodes();
	}
	/**
	 * initialise le document de sortie
	 * @throws ParserConfigurationException
	 */
	
	private void createDoc() throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		this.outHTML = db.newDocument();
		
		// this.outHTML =
		// HTMLDOMImplementationImpl.getHTMLDOMImplementation().createHTMLDocument("output");
	}
	/**
	 * créer la base HTML 
	 */
	private void createHTML() {
		Element html = outHTML.createElement("html");
		Element head = outHTML.createElement("head");
		Element body = outHTML.createElement("body");
		html.appendChild(head);
		html.appendChild(body);
		outHTML.appendChild(html);
		
	}
	/**
	 * crée la div index du document HTML
	 */
	private void createDivIndex() {
		Element div = outHTML.createElement("div");
		
		div.setAttribute("id", "indexConferences");
		Element ul = outHTML.createElement("ul");
		String confName = "";
		Element li = null;
		Element h1 = outHTML.createElement("h1");
		h1.setTextContent("Index");
		div.appendChild(h1);
		List<Node> lesConferences = nodeListToList(this.conferences, "conference");
		Collections.sort(lesConferences, new IndexConfComparator());
		
		for (Node conference : lesConferences) {
			if (conference.getNodeName().equals("conference")) {
				String titre = getChildNode(getChildNode(conference, "edition"), "titre").getTextContent();
				String acronyme = getChildNode(getChildNode(conference, "edition"), "acronyme").getTextContent();
				String annee = getChildNode(getChildNode(conference, "edition"), "dateDebut").getTextContent().substring(0, 4);
				if (!titre.equals(confName)) {
					if (li != null) {
						ul.appendChild(li);
					}
					li = null;
					li = outHTML.createElement("li");
					confName = titre;
					li.setTextContent(titre);
					li.appendChild(outHTML.createElement("br"));
				}
				Element a = outHTML.createElement("a");
				a.setTextContent(" " + annee);
				a.setAttribute("href", "#" + acronyme);
				li.appendChild(a);
				
			}
		}
		ul.appendChild(li);
		div.appendChild(ul);
		outHTML.getFirstChild().getChildNodes().item(1).appendChild(div);
		
	}
	/**
	 * crée la div détail du document HTML
	 */
	private void createDivDetail() {
		Element div = outHTML.createElement("div");
		div.setAttribute("id", "detailConferences");
		Element h1 = this.outHTML.createElement("h1");
		h1.setTextContent("Détail");
		div.appendChild(h1);
		
		List<Node> lesConferences = nodeListToList(this.conferences, "conference");
		Collections.sort(lesConferences, new DetailConfComparator());
		String annee = "";
		Element divAnnee = null;
		Element ulAnnee = null;
		for (Node conference : lesConferences) {
			if (!annee.equals(getChildNode(getChildNode(conference, "edition"), "dateDebut").getTextContent().substring(0, 4))) {
				if (divAnnee != null) {
					
					divAnnee.appendChild(ulAnnee);
					div.appendChild(divAnnee);
				}
				annee = getChildNode(getChildNode(conference, "edition"), "dateDebut").getTextContent().substring(0, 4);
				divAnnee = outHTML.createElement("div");
				divAnnee.setAttribute("id", annee);
				Element titreAnnee = outHTML.createElement("h2");
				titreAnnee.setTextContent(annee);
				divAnnee.appendChild(titreAnnee);
				ulAnnee = outHTML.createElement("ul");
			}
			
			Element divconf = outHTML.createElement("div");
			divconf.setAttribute("id", conference.getChildNodes().item(1).getChildNodes().item(1).getTextContent());
			divconf.setAttribute("name", conference.getChildNodes().item(1).getChildNodes().item(1).getTextContent());
			Element elementTitreConf = this.outHTML.createElement("h3");
			elementTitreConf.setTextContent(conference.getChildNodes().item(1).getChildNodes().item(1).getTextContent());
			divconf.appendChild(elementTitreConf);
			NodeList presidents = getChildNode(getChildNode(conference, "edition"), "presidents").getChildNodes();
			for (int i = 0; i < presidents.getLength(); i++) {
				if (presidents.item(i).getNodeName().equals("nom")) {
					Element divPresident = outHTML.createElement("div");
					
					divPresident.setTextContent("Président : " + presidents.item(i).getTextContent());
					divconf.appendChild(divPresident);
				}
			}
			Element elementLieu = outHTML.createElement("div");
			elementLieu.setTextContent("Lieu : " + getChildNode(getChildNode(conference, "edition"), "ville").getTextContent() + " - "
					+ getChildNode(getChildNode(conference, "edition"), "pays").getTextContent());
			divconf.appendChild(elementLieu);
			NodeList statistiques = getChildNode(getChildNode(conference, "edition"), "statistiques").getChildNodes();
			int nbStatistiques = 0;
			for (int i = 0; i < statistiques.getLength(); i++) {
				if (statistiques.item(i).getNodeName().equals("acceptations")) {
					nbStatistiques++;
					Element divStatistiques = outHTML.createElement("div");
					divStatistiques.setTextContent("Statistique : " + statistiques.item(i).getTextContent() + " articles "
							+ statistiques.item(i).getAttributes().getNamedItem("id").getTextContent() + " accepté sur "
							+ statistiques.item(i).getAttributes().getNamedItem("soumissions").getTextContent());
					divconf.appendChild(divStatistiques);
				}
			}
			if (nbStatistiques == 0) {
				Element divStatistiques = outHTML.createElement("div");
				divStatistiques.setTextContent("aucune statistique");
				divconf.appendChild(divStatistiques);
			}
			Element h4Reference = outHTML.createElement("h4");
			h4Reference.setTextContent("Références :");
			divconf.appendChild(h4Reference);
			Element ulReference = outHTML.createElement("ul");
			List<Node> lesReferences = nodeListToList(getChildNode(conference, "articles").getChildNodes(), "article");
			Collections.sort(lesReferences, new ReferenceComparator());
			for (Node reference : lesReferences) {
				Element divReference = outHTML.createElement("div");
				Element divTitre = outHTML.createElement("div");
				Element divAuteur = outHTML.createElement("div");
				Element bAuteur = outHTML.createElement("b");
				divTitre.setTextContent(getChildNode(reference, "titre").getTextContent());
				NodeList auteurs = getChildNode(reference, "auteurs").getChildNodes();
				String lesauteurs = "";
				for (int i = 0; i < auteurs.getLength(); i++) {
					if (auteurs.item(i).getNodeName().equals("auteur")) {
						lesauteurs += getChildNode(auteurs.item(i), "nom").getTextContent() + "; ";
					}
				}
				Element aId = outHTML.createElement("a");
				aId.setTextContent("["+reference.getAttributes().getNamedItem("id").getTextContent()+"]");
				divAuteur.appendChild(aId);
				bAuteur.setTextContent(lesauteurs);
				divAuteur.appendChild(bAuteur);
				divReference.appendChild(divAuteur);
				divReference.appendChild(divTitre);
				ulReference.appendChild(divReference);
			}
			divconf.appendChild(ulReference);
			ulAnnee.appendChild(divconf);
		}
		divAnnee.appendChild(ulAnnee);
		div.appendChild(divAnnee);
		outHTML.getFirstChild().getChildNodes().item(1).appendChild(div);
		
	}
	/**
	 * sérialise le document HTML
	 * @param htmlPath chemin du document de sortie
	 * @return
	 */
	public String DocumentToString(String htmlPath) {
		
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(this.outHTML);
			StreamResult result = new StreamResult(new FileOutputStream(htmlPath));
			StreamResult resultTest = new StreamResult(System.out);
			transformer.transform(source, resultTest);
			transformer.transform(source, result);
			return "yeah";
		} catch (Exception ex) {
			return "Error converting to String";
		}
		
	}
	/**
	 * recherche un enfant d'un noeud par son nom
	 * @param node Noeud parent de l'element recherché
	 * @param name nom de l'élément recherché
	 * @return élément recherché
	 */
	private Node getChildNode(Node node, String name) {
		NodeList children = node.getChildNodes();
		Node result = null;
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i).getNodeName().equals(name)) {
				result = children.item(i);
				break;
			}
		}
		return result;
	}
	/**
	 * convertie une nodeList en List de Node
	 * @param nodeList noliste a convertir
	 * @param name nom des élément de la liste
	 * @return la List des nodes provenant de la nodeList
	 */
	private List<Node> nodeListToList(NodeList nodeList, String name) {
		List<Node> result = new ArrayList<Node>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i).getNodeName().equals(name)) {
				result.add(nodeList.item(i));
			}
		}
		return result;
		
	}
}
