/*
Write a Java program that simulates the "Collatz Sequence." Given a starting integer 'n,' use a loop to generate the sequence by repeatedly applying the 
following rules: If 'n' is even, divide it by 2; if 'n' is odd, multiply it by 3 and add 1. Continue this process until 'n' becomes 1.
 */

import java.util.Scanner;

public class CollatzSequence{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int result = input.nextInt();

        String array = "";

        while (result != 1) {
            if (result % 2 == 0) {
                result = result / 2;
                array = array + " " + result;
            } else {
                result = (result * 3) + 1;
                array = array + " " + result;
            }

        }
        
        System.out.println(array);

    }

}
