/*
Create a Java program that calculates and displays the sum of digits of a given positive integer. 
 */
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer of any digits: ");
        int number = input.nextInt();

        while (number < 0) {
            System.out.print("Enter a POSITIVE INTEGER of any digits: ");
            number = input.nextInt();
        }

        int sum = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }

        System.out.println(sum);

    }

}
