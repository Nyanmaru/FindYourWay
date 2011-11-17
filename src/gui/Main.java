package gui;

import algorithm.DijkstraAlgorithm;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DijkstraAlgorithm da = new DijkstraAlgorithm();
		GUI gui = new GUI();
		
		gui.setAlgorithm(da);

	}

}
