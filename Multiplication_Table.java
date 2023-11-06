import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number you want the multiplication table of: ");
        int number = input.nextInt();
        
        System.out.println("How many multiples do you want? ");
        int multiples = input.nextInt();
        
        for(int i=1; i<=multiples; i++){
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
        
        input.close();
        
    }
    
}
