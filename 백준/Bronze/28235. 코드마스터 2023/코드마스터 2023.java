import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        switch (a) {
            case "SONGDO" :
                System.out.println("HIGHSCHOOL");
                break;
            case "CODE" :
                System.out.println("MASTER");
                break;
            case "2023" :
                System.out.println("0611");
                break;
            case "ALGORITHM" :
                System.out.println("CONTEST");
                break;
        }

    }
}