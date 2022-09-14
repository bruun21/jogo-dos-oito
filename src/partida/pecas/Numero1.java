package partida.pecas;

import partida.PecasPartida;
import tabuleiro.Tabuleiro;

public class Numero1 extends PecasPartida{

	public Numero1(Tabuleiro tabuleiro) {
		super(tabuleiro);
	}
	
	@Override
	public String toString() {
		return "1";
	}
}
