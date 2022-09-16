package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


	public Posicao getPosicao() {
		return posicao;
	}


	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	
}
