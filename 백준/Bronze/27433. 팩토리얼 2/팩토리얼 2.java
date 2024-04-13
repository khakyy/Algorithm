import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long a = scanner.nextLong();
		long result = 1;
		
		if (a == 0) {
			result = 1;
		} else {
			for (int i = 1; i <= a; i++) {
				result *= i;
			}
		}
		System.out.println(result);
	}
}