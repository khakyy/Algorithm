import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int max = 0;
		double result = 0;

		double[] arr = new double[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] > max) {
				max = (int) arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			result += arr[i] / N;
		}

		System.out.println(result);
	}
}