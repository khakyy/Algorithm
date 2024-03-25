import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		int b = scanner.nextInt();

		int[] c = new int[a];

		int f = 0;

		for (int i = 0; i < c.length; i++) {
			c[i] = i + 1;
		}

		for (int i = 0; i < b; i++) {
			int d = scanner.nextInt() - 1;
			int e = scanner.nextInt() - 1;

			f = c[d];
			c[d] = c[e];
			c[e] = f;
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}