import java.util.Scanner;
public class Demo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = isPalindrome(number);
        
        if (result == 1) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        scanner.close();
    }
    
    public static int isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        if (originalNum == reversedNum) {
            return 1;
        } else {
            return 0;
        }
    }
}

