import java.util.Locale;
import java.util.Scanner;

public class EntradaClass {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// leitura de um �nico caractere inserido pelo usu�rio
		System.out.println("Digite um caractere: ");
		Scanner sc = new Scanner(System.in);

		char x;
		x = sc.next().charAt(0);
		System.out.println("Voc� digitou: " + x);

		sc.close();
	}
}
