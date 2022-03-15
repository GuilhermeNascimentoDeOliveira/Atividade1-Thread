package view;

import controller.ati1;

public class ex1 {

	public static void main(String[] args) {

		for (int idThread = 0; idThread <5; idThread++){
			ati1 threadId = new ati1(idThread);
			threadId.start();
		}

	}

}
