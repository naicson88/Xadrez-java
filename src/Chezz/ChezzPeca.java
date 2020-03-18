package Chezz;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class ChezzPeca extends Peca{
	private Cor cor;

	public ChezzPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
}
