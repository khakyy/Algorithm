import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int[] list = new int[26];
		boolean d = true;

		for (int i = 0; i < a; i++) {
			String b = scanner.next();
			char c = b.charAt(0);
			list[c - 97]++;
		}
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] >= 5) {
				d = false;
				System.out.print((char)(i + 97));
			}
		}
		
		if (d) {
			System.out.println("PREDAJA");
		}
		
	}
}