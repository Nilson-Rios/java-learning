package breakswitch.pacote;

public class ContadorClasse {
	public static void main(String[] args) {
		int contador = 0;

		while (contador < 100) {
			if (contador % 2 == 0) {
				System.out.print(contador + ", ");
				contador++;
			}
		}
	}
}