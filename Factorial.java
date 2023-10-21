public class Factorial{
  public static int factorial(int n){
    int sum = 1;
        if(n == 1 || n == 0){
            return sum;
        } else if(n < 0){
            return n;
        } else {
            while(n > 1){
                sum *= n;
                n--;
            }
            return sum;
        }
  }
  
  public static void main(String[] args){
      System.out.println(factorial(0));
      System.out.println(factorial(1));
      System.out.println(factorial(2));
      System.out.println(factorial(3));
      System.out.println(factorial(4));
      System.out.println(factorial(5));
      System.out.println(factorial(6));
      System.out.println(factorial(7));
      System.out.println(factorial(8));
      System.out.println(factorial(9));
      System.out.println(factorial(-1));
      System.out.println(factorial(-2));
      System.out.println(factorial(-3));
      System.out.println(factorial(-4));
  }
  
}
