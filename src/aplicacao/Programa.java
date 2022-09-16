package aplicacao;

import java.util.Scanner;

import partida.Partida;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Partida partida = new Partida();
		
		
		while(partida.verificaFim()) {
			
			InterfaceUsuario.imprimirTabuleiro(partida.pecas());
			
			System.out.println();
			
			System.out.println("Digite o numero que deseja mudar de posição:");
			String pecaEscolhida = sc.nextLine();
			
			
			partida.moverPeca(pecaEscolhida);
	
		}
	}

}
