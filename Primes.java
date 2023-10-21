import java.util.Scanner;
import java.util.Arrays;

public class Primes {
    
    public static int nthPrime(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException("n must be a positive integer");
    }
    int count = 0;
    int number = 2;
    while (true) {
        if (isPrime(number)) {
            count++;
            if (count == n) {
                return number;
            }
        }
        number++;
    }
}

    public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    if (num <= 3) {
        return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
        return false;
    }
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many prime numbers do you want?");
      System.out.print("Answer: ");
      int number = input.nextInt();
      
      int arrayOfPrimes[] = new int[number];
      
      for(int i=1; i <= number; i++){
          int result = nthPrime(i);
          arrayOfPrimes[i-1] = result;
      }
      System.out.println(Arrays.toString(arrayOfPrimes));
    }  
}
