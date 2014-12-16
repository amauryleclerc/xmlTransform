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

public class BiblioToXhtmlJAXB {

	BufferedWriter writer;
	JAXBContext jc;
	Unmarshaller um;
	private Conference uneConference=null;
	private Conferences conference=null;
	private ArrayList<Conference> conferences = new ArrayList<>();
	private ArrayList<String> acronyme = new ArrayList<>();
	private ArrayList<String> ville = new ArrayList<>();
	private ArrayList<String> pays = new ArrayList<>();
	private ArrayList<String> president = new ArrayList<>();
	private Iterator<Conference> uneListeDeConference = null;
	Conferences conf=null;
	private ArrayList<String> refBestArticle = new ArrayList<>();


	public BiblioToXhtmlJAXB() {

		try {
			jc = JAXBContext.newInstance("jaxb.metier.generated");
			um = jc.createUnmarshaller();
			conf = (Conferences) um.unmarshal(new File(
					"TALN-RECITAL-BIB.xml"));
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
		try {
			writer.write("<div id=\"" + idIndex
					+ "\"><h>Index Conferences</h1><TABLE BORDER=\\" + 1
					+ "\"> ");
			for (String s : titres.keySet()) {
				writer.write("<th>" + s + "</th>");
				for (Integer i : titres.get(s)) {
					writer.write("<tr><th><a href=\"" + i + "\">" + i
							+ "</a></th></tr>");
				}
				writer.write("</div>\n");
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	public void createDivListIndex() {

		/* ArrayList<String> acronyme = new ArrayList<>();
		 ArrayList<String> ville = new ArrayList<>();
		 ArrayList<String> president = new ArrayList<>();
		 ArrayList<String> pays = new ArrayList<>();
		 ArrayList<String> refBestArticle = new ArrayList<>();*/
		 String bestArticles="";
		String presidents="";
		//Iterator<Conference> uneListeDeConference = null;


		uneListeDeConference = conferences.iterator();
	
		while(uneListeDeConference.hasNext()){
			uneConference = uneListeDeConference.next();
			acronyme.add(uneConference.getEdition().getAcronyme());
			ville.add(uneConference.getEdition().getVille());
			pays.add(uneConference.getEdition().getPays());
			for(int m=0;m<uneConference.getEdition().getPresidents().getNom().size();m++){
				presidents = presidents + uneConference.getEdition().getPresidents().getNom().get(m)+ " ";
			}
			president.add(presidents);
			for(int m=0;m<uneConference.getEdition().getMeilleurArticle().getArticleId().size();m++){
				bestArticles = bestArticles + uneConference.getEdition().getMeilleurArticle().getArticleId().get(m)+" ";
			}
			refBestArticle.add(bestArticles);
			/*for(int j=0;j<acronyme.size();j++){
				System.out.println("Ville : "+ville.get(j));
				System.out.println("acronyme : "+acronyme.get(j) );
				System.out.println("presidents"+president.get(j));
			}*/	
		}
		try {
			writer.write("<ul>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*
		 * Ecriture de l'entête Anacronyme/ President / lieu
		 */
		for(int j=0;j<acronyme.size();j++){
			try{
				
				writer.write("<tr><th colspan=3 >"+acronyme.get(j)+"</th></tr>"
							+ "<tr><td>Presidents : "+president.get(j)+"</td>"
							+ "<td> Localisation : "+ville.get(j)+"-"+pays.get(j)+"</td>"
							+ "<td>"+refBestArticle.get(j)+"</td></tr>");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		try {
			writer.write("</ul>");
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
	public static void main(String[] args){
		BiblioToXhtmlJAXB bibi = new BiblioToXhtmlJAXB();
		bibi.startHtmlDoc();
		bibi.createDivIndex();
		bibi.createDivListIndex();
		bibi.finishHtmlDoc();
	}

}
