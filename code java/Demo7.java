import java.util.Scanner;
public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your phone number: ");
        Long phoneNumber = scanner.nextLong();
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Phone Number: "+ phoneNumber);
        scanner.close();


    }
}