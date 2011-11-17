package algorithm;

import graph.Node;

public interface IAlgorithm {
	void setStartNode(Node node);
	void setEndNode(Node node);
	void start();
	Node[] getResult();
}
