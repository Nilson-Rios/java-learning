package array.pacote;

public class MediaArray {
	public static void main(String[] args) {
		double[] array = { 19, 12.89, 16.5, 200, 13.7, 78.98, 98.99 };
		double total = 0;

		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		/* array.lenght retorna o n�mero de elementos no array */
		double average = total / array.length; // soma os elementos do array e faz a m�dia, divindo pela quantidade de
												// elementos.
		/*
		  isso � usado para formatar a sa�da, se vo� usar %.4f ser� exibido 4 digitos
		  depois do ponto decimal.
		 */
		System.out.printf("A m�dia �: %.2f ", average);
	}
}
