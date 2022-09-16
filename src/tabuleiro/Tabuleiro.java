package tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcessaoTabuleiro(
					"Erro criando tabuleiro, é necessário que haja pelo menos uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca[][] getPecas() {
		return pecas;
	}

	public Peca peca(int linha, int coluna) {
		if (!existePosicao(linha, coluna)) {
			throw new ExcessaoTabuleiro("Posição inexistente no tabuleiro");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExcessaoTabuleiro("Posição inexistente no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocaPeca(Peca peca, Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExcessaoTabuleiro("Posição inexistente no tabuleiro");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}

	public boolean existeUmaPeca(Posicao posicao) {
		return peca(posicao) != null;
	}

	public Peca encontrarNoTabuleiro(String pecaEscolhida) {	
		Peca pecaEncontrada = null;
		for (int linha = 0; linha < pecas.length; linha++) {
			for (int coluna = 0; coluna < pecas.length; coluna++) {
				if (pecaEscolhida.contains(pecas[linha][coluna].toString())) {
					pecaEncontrada = pecas[linha][coluna];
				}
			}
		}
		return pecaEncontrada;
	}
	
	
	public List<Posicao> movimentosPossiveis (Posicao posicao) {
		List<Posicao> movimentos = new ArrayList<Posicao>();
		
		if (posicao.getColuna() + 1 <3) movimentos.add(new Posicao(posicao.getLinha(), posicao.getColuna() +1));
		
		if (posicao.getColuna() - 1 >= 0) movimentos.add(new Posicao(posicao.getLinha(), posicao.getColuna() -1));
		
		if (posicao.getLinha() + 1 <3) movimentos.add(new Posicao(posicao.getLinha() +1, posicao.getColuna()));
		
		if (posicao.getLinha() - 1 >= 0) movimentos.add(new Posicao(posicao.getLinha() -1, posicao.getColuna()));
		
		return movimentos;
	}
	
	
	public void trocaPecas(Peca espaco, Peca pecaMudar) {
		Posicao aux = new Posicao(espaco.posicao.getLinha(),espaco.posicao.getColuna());
		colocaPeca(espaco, pecaMudar.posicao);
		colocaPeca(pecaMudar, aux);
	}
}
