package partida.pecas;

import partida.PecasPartida;
import tabuleiro.Tabuleiro;

public class Espaco extends PecasPartida{

	public Espaco(Tabuleiro tabuleiro) {
		super(tabuleiro);
	}
	
	@Override
	public String toString() {
		return " ";
	}
}
