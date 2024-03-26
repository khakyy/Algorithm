import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		
		String b = scanner.next();
		
		int c;
		
		int d;
		
		c = Integer.parseInt(a.substring(2, 3) + a.substring(1, 2) + a.substring(0, 1));
		
		d = Integer.parseInt(b.substring(2, 3) + b.substring(1, 2) + b.substring(0, 1));
		
		if (c > d) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}
		
	}
}