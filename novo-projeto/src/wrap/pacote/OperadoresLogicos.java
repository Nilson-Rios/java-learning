package wrap.pacote;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 e b2 são v?: " + (b1 && b2));
		System.out.println("b1 ou b2 são v?: " + (b1 || b2));
		System.out.println("a diferença de b1 é: " + (!b1));
		System.out.println("");
	}
}
