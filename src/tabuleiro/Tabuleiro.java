package tabuleiro;

public class Tabuleiro {
	private int linha;
	private int coluna;
	private Peca[][] pecas;
	
	public Tabuleiro(int linha, int coluna) {
		if (linha < 1 || coluna < 1) {
			throw new TabuleiroExcecao("Erro: É necessário pelo menos uma linha e uma coluna");
		}
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	
	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new TabuleiroExcecao("Posição não está no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void placePeca(Peca peca, Posicao posicao) {
		if (haPeca(posicao)) {
			throw new TabuleiroExcecao("Já existe uma peça nessa posição");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return linha + "," + coluna;
	}
	
	private boolean posicaoExiste(int row, int column) {
		return row >= 0 && row < linha  && column >= 0 && column < coluna;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean haPeca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroExcecao("Posição não está no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
