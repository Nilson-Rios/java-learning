package Elseif.pacote;

import java.util.Scanner;

public class ComparativoClasse {
	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 3;
		int valor3 = 5;

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("Valor1 é maior");
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("Valor2 é maior");
		} else {
			System.out.println("Valor3 é maior");
		}
	}

}
