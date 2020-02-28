package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		for(int thread = 1; thread<=100; thread++) {
			Thread tc = new ThreadController(thread);
			tc.start();
		}
	}

}
