import java.util.Scanner;

public class PS002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        int roundedNumber = (int) (Math.round(number / 100.0) * 100);

        System.out.println("Multiple of 100 " + roundedNumber);
    }
}