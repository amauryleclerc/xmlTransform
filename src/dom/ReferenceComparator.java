package dom;

import java.util.Comparator;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReferenceComparator implements Comparator<Node> {
	
	/**
	 * compare deux noeuds article pour les trier
	 * 
	 */
	@Override
	public int compare(Node o1, Node o2) {
		String nom1 = (String) getChildNode(getChildNode(o1, "auteurs"), "auteur").getTextContent();
		String nom2 = (String) getChildNode(getChildNode(o2, "auteurs"), "auteur").getTextContent();
		return nom1.compareTo(nom2);
		
	}
	/**
	 * recherche un enfant d'un noeud par son nom
	 * @param node Noeud parent de l'element recherch�
	 * @param name nom de l'�l�ment recherch�
	 * @return �l�ment recherch�
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
}
