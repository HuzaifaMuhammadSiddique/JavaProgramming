class PrimeChecker {
    
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        
        if(number <= 3){
            return true;
        }
        
        if(number % 2 == 0 || number % 3 == 0){
            return false;
        }
        
        for(int i=5; i*i <= number; i=i+6){
            if((number % i == 0) || (number % (i+2) == 0)){
                return false;
            }
        }
        
        return true;
    }
    
    
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        
        for(int i=0; i <= 500; i++){
            if(isPrime(i) == true){
                num++;
                sum += i;
            }
            System.out.println(i);
            System.out.println(isPrime(i));

        }
        System.out.println("Total prime numbers are: " + num);
        System.out.println("Total sum of prime numbers are: " + sum);
    }
}
