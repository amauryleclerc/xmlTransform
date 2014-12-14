package dom;

import java.util.Comparator;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DetailConfComparator implements Comparator<Node>{

	@Override
	public int compare(Node o1, Node o2) {
	    String annee1 = (String)getChildNode( getChildNode(o1,"edition"),"dateDebut").getTextContent().substring(0, 4);
	    String annee2 = (String)getChildNode( getChildNode(o2,"edition"),"dateDebut").getTextContent().substring(0, 4);
	   int result = annee1.compareTo(annee2);
	   if(result==0){
		   String ac1 = (String)getChildNode( getChildNode(o1,"edition"),"acronyme").getTextContent();
		   String ac2 = (String)getChildNode( getChildNode(o2,"edition"),"acronyme").getTextContent();
		   result = ac1.compareTo(ac2);
	   }
	    return result;

	}
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
