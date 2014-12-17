package jaxb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.metier.generated.Conferences;
import jaxb.metier.generated.Conferences.Conference;

/**
 * 
 * @author E14D720E-Martineau Thomas
 * 
 */
public class BiblioToXhtmlJAXB {

	BufferedWriter writer;
	JAXBContext jc;
	Unmarshaller um;
	private Conference conference = null;
	private ArrayList<Conference> conferences = new ArrayList<>();
	private ArrayList<String> acronyme = new ArrayList<String>();
	private ArrayList<String> ville = new ArrayList<String>();
	private ArrayList<String> pays = new ArrayList<String>();
	private ArrayList<String> president = new ArrayList<String>();
	private ArrayList<String> siteweb = new ArrayList<String>();
	private Iterator<Conference> ListeConference = null;

	Conferences conf = null;
	private ArrayList<String> refBestArticle = new ArrayList<>();

	// Constructeur
	public BiblioToXhtmlJAXB() {

		try {
			// Objet principal pour les opérations de transformation
			jc = JAXBContext.newInstance("jaxb.metier.generated");
			// Objet de type Unmarshaller pour transformer le doc XML
			um = jc.createUnmarshaller();
			// méthode unmarshall qui se charge de traiter un doc XML
			conf = (Conferences) um.unmarshal(new File("TALN-RECITAL-BIB.xml"));
			writer = new BufferedWriter(new FileWriter("conf.html"));
			conferences = (ArrayList<Conference>) conf.getConference();

		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Fonction pour créer le début d'une page Html
	 */
	public void startHtmlDoc() {
		String charset = "utf-8";
		try {
			writer.write("<!doctype html> \n" + "<html> \n" + "<head> \n"
					+ "<meta charset=\"" + charset + "\">\n"
					+ "<title>Conferences</title>\n" + "</head>\n" + "<body>");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Fonction pour créer la div index de la page html
	 */
	public void createDivIndex() {
		String idIndex = "index";
		HashMap<String, TreeSet<Integer>> titres = new HashMap<>();
		//Ecriture du début de la division
		try {
			writer.write("<div id=\"" + idIndex + "\">");
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Récupération des Titres et des Années
		for (Conference c : conferences) {
			if (titres.get(c.getEdition().getTitre()) != null) {
				TreeSet<Integer> tab = titres.get(c.getEdition().getTitre());
				tab.add(c.getEdition().getDateDebut().getYear());
				titres.put(c.getEdition().getTitre(), tab);
			} else {
				TreeSet<Integer> tab = new TreeSet<>();
				tab.add(c.getEdition().getDateDebut().getYear());
				titres.put(c.getEdition().getTitre(), tab);
			}
		}
		//Ecriture des titres et des années correspondandtes dans une liste
		try {
			writer.write("<h1>Index Conferences</h1><TABLE BORDER=\\" + 1
					+ "\"> ");
			for (String s : titres.keySet()) {
				writer.write("<ul>" + s + "<br>");
				for (Integer i : titres.get(s)) {
					writer.write("<li><a href=\"" + i + "\">" + i
							+ " </a></li>");
				}
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Ecriture de la fin de première division
		try {
			writer.write("</div>");
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
/*
 * Fonction permettant de créer la liste des conférences
 */
	public void createDivListIndex() {

		ListeConference = conferences.iterator();

		while (ListeConference.hasNext()) {

			conference = ListeConference.next();
			//On récupère l'acronyme
			acronyme.add(conference.getEdition().getAcronyme());
			//On récupère les informations géographique (ville et Pays)
			ville.add(conference.getEdition().getVille());
			pays.add(conference.getEdition().getPays());
			//On récupère les site web de la conférence
			siteweb.add(conference.getEdition().getSiteWeb());

			
			//On récupère les présidents
			String presidents = "";
			for (int m = 0; m < conference.getEdition().getPresidents()
					.getNom().size(); m++) {
				presidents = presidents
						+ conference.getEdition().getPresidents().getNom()
								.get(m) + " / ";

			}
			president.add(presidents);
			
			//On récupères les id des meilleurs articles correspondants à la conférence   
			String bestArticles = "";
			for (int m = 0; m < conference.getEdition().getMeilleurArticle()
					.getArticleId().size(); m++) {
				bestArticles = bestArticles
						+ conference.getEdition().getMeilleurArticle()
								.getArticleId().get(m) + " / ";

			}
			refBestArticle.add(bestArticles);

		}
		//Ecriture du début de la div list de conferences
		try {
			writer.write("<h1>Liste Conferences</h1><ul>");
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//ECriture des informations dans des tableaux contenant les informations des conférences
		for (int i = 0; i < 13; i++) {
			try {
				writer.write("<tr><th colspan=3 >" + acronyme.get(i)
						+ "</th></tr>" + "<tr><td>Presidents : "
						+ president.get(i) + "</td>" + "<td> Localisation : "
						+ ville.get(i) + "-" + pays.get(i) + "</td>" + "<td>"
						+ refBestArticle.get(i) + "</td></tr>"
						+ "<tr><td colspan=3>Site Internet : " + siteweb.get(i)
						+ "</td></tr>");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//Ecriture de fin de la div
		try {
			writer.write("</ul>");
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/*
	 * Fonction pour créer la fin d'un document html
	 */
	public void finishHtmlDoc() {
		try {
			writer.write("</body>\n" + "</html>\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Fonction Principale
	 */
	public static void main(String[] args) {
		BiblioToXhtmlJAXB bibli = new BiblioToXhtmlJAXB();
		bibli.startHtmlDoc();
		bibli.createDivIndex();
		bibli.createDivListIndex();
		bibli.finishHtmlDoc();
	}

}
