package partida;

import tabuleiro.Tabuleiro;

public class Partida {
	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro(3,3);
	}
	
	public PecasPartida [][] pecas(){
		PecasPartida[][] tabuleiroMontado = new PecasPartida[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int linha=0; linha < tabuleiro.getLinhas(); linha++) {
			for (int coluna=0; coluna < tabuleiro.getLinhas(); coluna++) {
				tabuleiroMontado[linha][coluna] = (PecasPartida) tabuleiro.peca(linha,coluna);
			}
		}
		return tabuleiroMontado;
	}
}
