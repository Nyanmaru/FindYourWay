package gui;

import graph.Node;
import algorithm.IAlgorithm;

public class GUI {

	public void setAlgorithm(IAlgorithm algorithm) {
		Node node = new Node();
		Node result[] = null;
		
		algorithm.setStartNode(node);
		result = algorithm.getResult();
	}
	
}
