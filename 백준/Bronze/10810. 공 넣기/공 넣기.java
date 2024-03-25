import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		int b = scanner.nextInt();

		int[] c = new int[a];

		for (int i = 0; i < b; i++) {

			int d = scanner.nextInt();
			int e = scanner.nextInt();
			int f = scanner.nextInt();

			if (d == e) {
				c[d - 1] = f;
			} else {
				for (int j = d - 1; j <= e - 1; j++) {
					c[j] = f;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}