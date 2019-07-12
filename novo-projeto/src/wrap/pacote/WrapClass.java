package wrap.pacote;

public class WrapClass {
	public static void main(String[] args) {
		// cria um objeto wrapper
		Integer velocidade = new Integer(587);
		// converte a variável velocidade para o tipo primitivo
		double total = velocidade.doubleValue();
		short total1 = velocidade.shortValue();
		byte total2 = velocidade.byteValue();

		Float pi = new Float(3.14f);
		int valorPi = pi.intValue();
		System.out.println("Valor de pi arrendado: " + valorPi);
		System.out.println("Total: " + total);
		System.out.println("Total: ");
		//sempre que se abre aspas duplas se abre uma nova string, mesmo sem variável atribuída.
		
	}
}
