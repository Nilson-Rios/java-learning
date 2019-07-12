	import java.util.Locale;

	public class main {

		public static void main(String[] args) {
			String product1 = "Computer";
			String product2 = "Office desk";

			int age = 30;
			int code = 5290;
			char gender = 'F';

			double price1 = 2100.0;
			double price2 = 650.0;
			double measure = 53.214567;

			System.out.println("Products: \n");
			System.out.printf(product1 + "which price is $%.2f:" + price1);
			System.out.printf(product2 + "which price is $%.2f" + price2);
			System.out.println();
			System.out.println("Record:" + age + "years old, code" + code + "gender" + gender);
			System.out.println();
			System.out.printf("Measure with eight decimal places %.7f:" + measure);
			System.out.printf("Rouded (three decimal places): %.3f" + measure);
			Locale.setDefault(Locale.US);
			System.out.printf("US decimal point %.2f:" + measure);

		}
	}


