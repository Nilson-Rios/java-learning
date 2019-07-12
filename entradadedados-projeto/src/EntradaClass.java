import java.util.Locale;
import java.util.Scanner;

public class EntradaClass {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// leitura de um único caractere inserido pelo usuário
		System.out.println("Digite um caractere: ");
		Scanner sc = new Scanner(System.in);

		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);

		sc.close();
	}
}
