import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String c = null;
		for (int i = 0; i < a; i++) {
			String b = scanner.next();
			if (b.length() == 1) {
				c = b.substring(0) + b.substring(0);
			} else {
				c = b.substring(0, 1) + b.substring(b.length() - 1, b.length());
			}
			System.out.println(c.toString());
		}
		
	}
}