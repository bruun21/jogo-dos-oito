package partida;

import partida.pecas.Espaco;
import partida.pecas.Numero1;
import partida.pecas.Numero2;
import partida.pecas.Numero3;
import partida.pecas.Numero4;
import partida.pecas.Numero5;
import partida.pecas.Numero6;
import partida.pecas.Numero7;
import partida.pecas.Numero8;
import tabuleiro.ExcessaoTabuleiro;
import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Partida {
	private Tabuleiro tabuleiro;

	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	public Partida() {
		tabuleiro = new Tabuleiro(3, 3);
		inicializacaoPartida();
	}

	
	public PecasPartida[][] pecas() {
		PecasPartida[][] tabuleiroMontado = new PecasPartida[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int linha = 0; linha < tabuleiro.getLinhas(); linha++) {
			for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
				tabuleiroMontado[linha][coluna] = (PecasPartida) tabuleiro.peca(linha, coluna);
			}
		}
		return tabuleiroMontado;
	}

	
	private void inicializacaoPartida() {
		tabuleiro.colocaPeca(new Numero1(tabuleiro), new Posicao(0, 2));
		tabuleiro.colocaPeca(new Numero2(tabuleiro), new Posicao(0, 0));
		tabuleiro.colocaPeca(new Numero3(tabuleiro), new Posicao(0, 1));
		tabuleiro.colocaPeca(new Numero4(tabuleiro), new Posicao(1, 0));
		tabuleiro.colocaPeca(new Numero5(tabuleiro), new Posicao(1, 2));
		tabuleiro.colocaPeca(new Numero6(tabuleiro), new Posicao(1, 1));
		tabuleiro.colocaPeca(new Numero7(tabuleiro), new Posicao(2, 1));
		tabuleiro.colocaPeca(new Numero8(tabuleiro), new Posicao(2, 0));
		tabuleiro.colocaPeca(new Espaco(tabuleiro), new Posicao(2, 2));
		Peca espaco = tabuleiro.encontrarNoTabuleiro(" ");
		tabuleiro.movimentosPossiveis(espaco);
	}

	
	public void moverPeca(String pecaEscolhida) {
		Peca espaco = tabuleiro.encontrarNoTabuleiro(" ");

		Peca peca = tabuleiro.encontrarNoTabuleiro(pecaEscolhida);

		tabuleiro.movimentosPossiveis(espaco);

		if (peca.isMovimenta()) {
			tabuleiro.trocaPecas(espaco, peca);
		}
		else {
			throw new ExcessaoTabuleiro("Movimento inválido");
		}
	}
	
	public boolean verificaFim() {
		int contadorVerificacao = 1;
		for (int linha = 0; linha < tabuleiro.getLinhas(); linha++) {
			for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
				if (tabuleiro.getPecas()[linha][coluna].toString() == Integer.toString(contadorVerificacao, linha)) {
					contadorVerificacao++;
					if (contadorVerificacao == 8) {
						return false;
					}
				}
			}
		}
		return true; 
	}
}
