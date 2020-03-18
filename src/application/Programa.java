package application;

import Chezz.ChezzMach;

public class Programa {
	public static void main (String[] args) {
		
		ChezzMach chezzmach = new ChezzMach();
		UI.printTabuleiro(chezzmach.getPeca());
		System.out.print(chezzmach);
	}
}
