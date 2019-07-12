package Elseif.pacote;

import java.util.Scanner;

public class ElseifClasse {
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o mês do ano: ");
		int mesDoAno = entrada.nextInt();

		if (mesDoAno == 12 || mesDoAno == 1 || mesDoAno == 2) {
			System.out.println("Verão");
		} else if (mesDoAno == 3 || mesDoAno == 4 || mesDoAno == 5) {
			System.out.println("Outono");
		} else if (mesDoAno == 6 || mesDoAno == 7 || mesDoAno == 9) {
			System.out.println("Inverno");
		} else if (mesDoAno == 9 || mesDoAno == 10 || mesDoAno == 11) {
			System.out.println("Primavera");
		} else {
			System.out.println("Mês não é válido");
		}
	}
}
