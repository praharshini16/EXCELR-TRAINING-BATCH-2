
import java.util.Scanner;
public class Demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Fizz Bizz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Bizz");
        } else {
            System.out.println(number);
        }
    }

}
