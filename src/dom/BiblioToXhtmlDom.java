package dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BiblioToXhtmlDom {
	private Document outHTML = null;
	private NodeList conferences = null;

	public static void main(String args[]) {
		String xmlPath = System.getProperty("user.dir")
				+ "/TALN-RECITAL-BIB.xml";
		BiblioToXhtmlDom biblioToXhtmlDom = new BiblioToXhtmlDom();
		try {
			biblioToXhtmlDom.setXml(xmlPath);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println("ERREUR de parse XML"+ e.getMessage());
			e.printStackTrace();
		}
		biblioToXhtmlDom.createDivIndex();

	}

	public void setXml(String xmlPath) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File(xmlPath));
		this.conferences = doc.getElementsByTagName("conferences").item(0).getChildNodes();
	}

	private void createDivIndex() {
		System.out.println(conferences.getLength());
	}

	private void createDivDetail() {

	}

}
