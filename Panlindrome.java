package arrays;
import java.util.Arrays;
import java.util.Scanner;



public class Arrays {
    
    public static boolean palindromeChecker(String word){
        char stringArray[] = word.toCharArray();
        int arrayLength = stringArray.length;
        
        char reversedArray[] = new char[arrayLength];
        
        for(int i=0; i<arrayLength; i++){
            reversedArray[i] = stringArray[(arrayLength-1) - i];         
        }
        
        // System.out.println(Arrays.toString(stringArray));
        // System.out.println(Arrays.toString(reversedArray));
        
        boolean isPalindrome = Arrays.equals(stringArray, reversedArray);
        return isPalindrome;
    }

    
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       System.out.print("Enter a string: ");
       String userString;
       userString = input.nextLine();
       
       boolean result = palindromeChecker(userString);
       
       if(result == true){
           System.out.println("The string you entered is a palindrome.");
       } else{
           System.out.println("The string you entered is not a panlindrome.");
       }
    }
    
    
    
}


