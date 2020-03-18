package Chezz;

import Chezz.pecas.King;
import Chezz.pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class ChezzMach {
	private Tabuleiro tabuleiro;
	
	public ChezzMach() {
		tabuleiro = new Tabuleiro(8, 8);
		setupInicial();
	}
	
	public ChezzPeca[][] getPeca(){
		ChezzPeca[][] 	matriz = new ChezzPeca[tabuleiro.getLinha()][tabuleiro.getColuna()];
			for ( int i = 0; i < tabuleiro.getLinha(); i++) {
				for (int j = 0; j < tabuleiro.getColuna(); j++) {
					matriz[i][j] = (ChezzPeca) tabuleiro.peca(i, j);
				}
			
			}
			
			return matriz;
	}
	
	private void setupInicial() {
		tabuleiro.placePeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(7, 1));
		tabuleiro.placePeca(new King(tabuleiro, Cor.BLACK), new Posicao(0, 4));
	}
}
