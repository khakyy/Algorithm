import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println("0" + localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
    }
}