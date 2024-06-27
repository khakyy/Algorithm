import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int a = scanner.nextInt();

            if(a == 0){
                break;
            }

            System.out.println(a * (a + 1) / 2);
        }
    }
}