package aplicacao;

import partida.Partida;

public class Programa {

	public static void main(String[] args) {
		Partida partida = new Partida();
		InterfaceUsuario.imprimirTabuleiro(partida.pecas());
	}

}
