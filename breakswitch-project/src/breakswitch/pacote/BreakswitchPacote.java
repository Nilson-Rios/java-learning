package breakswitch.pacote;

import java.util.Scanner;

public class BreakswitchPacote {
	public static void main(String[] args) {

		System.out.println("Digite um m�es do ano em numeral: ");
		Scanner sc = new Scanner(System.in);
		int mesDoano = sc.nextInt();

		switch (mesDoano) {
		case 12:
		case 1:
		case 2:
			System.out.println("Ver�o");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Outono");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("Inverno");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Primavera");
			break;
			default:
			System.out.println("m�s inv�lido");
			
		}
	}
}
