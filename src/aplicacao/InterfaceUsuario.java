package aplicacao;

import partida.PecasPartida;

public class InterfaceUsuario {
	
	public static void imprimirTabuleiro(PecasPartida[][] pecas) {
		for (int linha=0; linha < pecas.length; linha++) {
			for (int coluna=0; coluna < pecas.length; coluna++) {
				imprimirPeca(pecas[linha][coluna]);
			}
			System.out.println();
		}
	}
	
	private static void imprimirPeca(PecasPartida peca) {
		if (peca == null) {
			System.out.print(" ");
		} else {
			System.out.print("peca");
		}
		System.out.print(" ");
	}
}
