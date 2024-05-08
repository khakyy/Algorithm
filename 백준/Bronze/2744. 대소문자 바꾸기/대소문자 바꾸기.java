import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		
		String result = "";
		
		for (int i = 0; i < a.length(); i++) {
			if (Character.isUpperCase(a.charAt(i)) == true) {
				result += Character.toLowerCase(a.charAt(i));
			} else {
				result += Character.toUpperCase(a.charAt(i));
			}
		}
		System.out.println(result);
	}
}