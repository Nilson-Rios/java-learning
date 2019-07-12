package array.pacote;

public class TesteArray {
	public static void main(String[] args) {
		int a[] = new int[8];
		a[0] = 10;
		a[1] = 9;
		a[2] = 8;
		a[3] = 7;
		a[5] = 6;
		a[6] = 5;
		a[7] = 4;

		System.out.println(a[6]);

		int[] a1 = { 10, 9, 8, 7, 6, 5, 4 };
		System.out.println(a1[6]);

		int b[] = new int[7];
		a[0] = 40;
		a[1] = 36;
		a[2] = 49;
		a[3] = 64;
		a[5] = 81;
		a[6] = 100;
		System.out.println(b[5]);
		int[] b1 = { 10, 9, 8, 7, 6, 5, 4 };
		System.out.println(b1[5]);

	}
}
