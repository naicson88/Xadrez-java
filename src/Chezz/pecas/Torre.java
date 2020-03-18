package Chezz.pecas;

import Chezz.ChezzPeca;
import Chezz.Cor;
import tabuleiro.Tabuleiro;

public class Torre extends ChezzPeca {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}
