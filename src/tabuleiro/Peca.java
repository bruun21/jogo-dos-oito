package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	private boolean movimenta = false;
	
	public boolean isMovimenta() {
		return movimenta;
	}
	public void setMovimenta(boolean movimenta) {
		this.movimenta = movimenta;
	}

	
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
