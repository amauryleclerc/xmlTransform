package dom;

import java.util.Comparator;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IndexConfComparator implements Comparator<Node>{
	/**
	 * compare deux noeuds conference pour les trier
	 * 
	 */
	@Override
	public int compare(Node o1, Node o2) {
		   String titre1 = (String)getChildNode( getChildNode(o1,"edition"),"titre").getTextContent();
		   String titre2 = (String)getChildNode( getChildNode(o2,"edition"),"titre").getTextContent();
	   int result = titre1.compareTo(titre2);

	   if(result==0){
		   String annee1 = (String)getChildNode( getChildNode(o1,"edition"),"dateDebut").getTextContent().substring(0, 4);
		   String annee2 = (String)getChildNode( getChildNode(o2,"edition"),"dateDebut").getTextContent().substring(0, 4);
		
		   result = annee1.compareTo(annee2);
	   }
	    return result;

	}
	/**
	 * recherche un enfant d'un noeud par son nom
	 * @param node Noeud parent de l'element recherché
	 * @param name nom de l'élément recherché
	 * @return élément recherché
	 */
	private Node getChildNode(Node node, String name){
		NodeList children = node.getChildNodes();
		Node result =null;
		for(int i = 0; i<children.getLength();i++){
			if(children.item(i).getNodeName().equals(name)){
				result = children.item(i);
				break;
			}
		}
		return result;
	}
}
