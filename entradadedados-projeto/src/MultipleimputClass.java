import java.util.Locale;
import java.util.Scanner;

public class MultipleimputClass {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		// multiple data types inputs. 
		System.out.println("Enter your name: ");
		x = sc.next();
		System.out.println("Enter your age: ");
		y = sc.nextInt();
		System.out.println("Enter your weight: ");
		z = sc.nextDouble();
		
		System.out.println("Your name is: " +x);
		System.out.println("Your age is: " + y);
		System.out.println("Your weight is: " + z);
		sc.close();
	}
}
