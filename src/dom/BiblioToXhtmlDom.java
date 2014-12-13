package dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BiblioToXhtmlDom {
	private Document outHTML = null;
	private NodeList conferences = null;
	
	public static void main(String args[]) {
		String xmlPath = System.getProperty("user.dir") + "/TALN-RECITAL-BIB.xml";
		BiblioToXhtmlDom biblioToXhtmlDom = new BiblioToXhtmlDom();
		try {
			biblioToXhtmlDom.setXml(xmlPath);
			biblioToXhtmlDom.createDoc();
			biblioToXhtmlDom.createHTML();
			biblioToXhtmlDom.createDivIndex();
			biblioToXhtmlDom.DocumentToString();
			biblioToXhtmlDom.createDivDetail();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println("ERREUR de parse XML" + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void setXml(String xmlPath) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File(xmlPath));
		this.conferences = doc.getElementsByTagName("conferences").item(0).getChildNodes();
	}
	
	private void createDoc() throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		this.outHTML = db.newDocument();
		
		// this.outHTML =
		// HTMLDOMImplementationImpl.getHTMLDOMImplementation().createHTMLDocument("output");
	}
	
	private void createHTML() {
		Element html = outHTML.createElement("html");
		Element head = outHTML.createElement("head");
		Element body = outHTML.createElement("body");
		html.appendChild(head);
		html.appendChild(body);
		outHTML.appendChild(html);
		
	}
	
	private void createDivIndex() {
		Element div = outHTML.createElement("div");
		
		div.setAttribute("id", "indexConferences");
		Element ul = outHTML.createElement("ul");
		String confName = "";
		Element li = null;
		Element h1 = outHTML.createElement("h1");
		h1.setTextContent("Index");
		div.appendChild(h1);
		for (int i = 0; i < this.conferences.getLength(); i++) {
			if (this.conferences.item(i).getNodeName().equals("conference")) {
			if (this.conferences.item(i).getChildNodes().item(1).getChildNodes().item(3).getTextContent().equals(confName)) {
				Element a = outHTML.createElement("a");
				a.setTextContent(" "+this.conferences.item(i).getChildNodes().item(1).getChildNodes().item(1).getTextContent());
				a.setAttribute("href", "#");
				
				li.appendChild(a);
				
			} else {
				if (li != null) {
					ul.appendChild(li);
				}
				//System.out.println( this.conferences.item(i).getChildNodes().item(1).getChildNodes().item(3).getTextContent());
				li = null;
				li = outHTML.createElement("li");
				confName = this.conferences.item(i).getChildNodes().item(1).getChildNodes().item(3).getTextContent();
				li.setTextContent(this.conferences.item(i).getChildNodes().item(1).getChildNodes().item(3).getTextContent());
				li.appendChild(outHTML.createElement("br"));
				Element a = outHTML.createElement("a");
				a.setTextContent(this.conferences.item(i).getChildNodes().item(1).getChildNodes().item(1).getTextContent());
				a.setAttribute("href", "#");
				
				li.appendChild(a);
			}
			}
		}
		ul.appendChild(li);
		div.appendChild(ul);
		outHTML.getFirstChild().getChildNodes().item(1).appendChild(div);
		
	}
	
	private void createDivDetail() {
		Element div = outHTML.createElement("div");
		div.setAttribute("id", "detailConferences");
		
	}
	
	public String DocumentToString() {
		
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(this.outHTML);
			StreamResult result = new StreamResult(System.out);
			transformer.transform(source, result);
			return "yeah";
		} catch (Exception ex) {
			return "Error converting to String";
		}
		
	}
}
