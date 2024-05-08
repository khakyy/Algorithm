import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if (a > b) {
				System.out.println("Yes");
			} else if (a < b || (a == b && a != 0)) {
				System.out.println("No");
			} else {
				break;
			}	
		}
	}
}