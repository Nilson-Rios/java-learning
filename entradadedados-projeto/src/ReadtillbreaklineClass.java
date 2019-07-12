import java.util.Locale;
import java.util.Scanner;

public class ReadtillbreaklineClass {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s1;
		String s2;
		String s3;
		
		//reading a text until reach a line break.
		
		System.out.println("Type one sentence: ");
		s1 = sc.nextLine(); //using only next it will read only the first word, to read a full line you must use "nextLine"
		System.out.println("Type another sentence: ");
		s2 = sc.nextLine();
		System.out.println("Type the last sentence: ");
		s3 = sc.nextLine();
		
		System.out.println("Typed data: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}
}
