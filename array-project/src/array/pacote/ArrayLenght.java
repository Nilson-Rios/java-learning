package array.pacote;

public class ArrayLenght {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 500, 700, 6888, 878456, 5656565 };
		System.out.println(array[0]); // acessando o primeiro elemento do array
		System.out.println(array[6]); // acessando o elemento do indice 6
		System.out.println(array[array.length - 1]); // acessando o último elemento. Ex: se o array tem 20 elementos, 20-1, a última posição é 19.

		for (int i : array) { // percorre e imprime os elementos do array (for each)
			System.out.println(i);
		}
		System.out.println("O tamanho da array é: " + array.length);
	}
}
