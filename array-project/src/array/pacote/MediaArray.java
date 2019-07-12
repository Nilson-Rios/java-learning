package array.pacote;

public class MediaArray {
	public static void main(String[] args) {
		double[] array = { 19, 12.89, 16.5, 200, 13.7, 78.98, 98.99 };
		double total = 0;

		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		/* array.lenght retorna o número de elementos no array */
		double average = total / array.length; // soma os elementos do array e faz a média, divindo pela quantidade de
												// elementos.
		/*
		  isso é usado para formatar a saída, se voê usar %.4f será exibido 4 digitos
		  depois do ponto decimal.
		 */
		System.out.printf("A média é: %.2f ", average);
	}
}
