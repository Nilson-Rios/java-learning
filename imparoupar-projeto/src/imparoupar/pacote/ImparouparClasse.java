package imparoupar.pacote;

import java.util.Scanner;

public class ImparouparClasse {
	public static void main(String[] args) {

		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else
			System.out.println("O número é impar");
	}
}
