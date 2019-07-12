package Elseif.pacote;

import java.util.Scanner;

public class ComparestringClasse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite m para masculino e f para feminino: ");
		String valorDigitado = sc.next();
		if (valorDigitado.toUpperCase().equals("M")) {
			System.out.println("Masculino");
		} else if (valorDigitado.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}
	}
}