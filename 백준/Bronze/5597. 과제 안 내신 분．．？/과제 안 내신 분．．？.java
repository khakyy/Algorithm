import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] a = new int[31];

		for (int i = 1; i <= 28; i++) {
			int b = scanner.nextInt();
			a[b] = 1;
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i] != 1) {
				System.out.println(i);
			}
		}

	}
}