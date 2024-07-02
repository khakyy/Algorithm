import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
        
		if(1 <= a % 5 && a % 5 <= 4) {
			System.out.println(a / 5 + 1);
		}else {
			System.out.println(a / 5);
		}

	}
}