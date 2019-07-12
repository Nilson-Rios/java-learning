package array.pacote;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCount {
	public static void main(String[] args) {
		
		int count;
		int temp;

		
		// Usuário determina o tamanho da array - user imputs the array size
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre o número de elementos que você quer no array: ");
		count = scan.nextInt();
		
		
		int num[] = new int[count];
		System.out.println("Entre com os elementos do array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(num);
		
		System.out.println("Elementos do array em ordem ascendente: ");
		for (int i = 0; i < num.length -1; i++) {
			System.out.println(num[i] +", ");
		}
		
		System.out.println(num[count -1]);
	}

}
