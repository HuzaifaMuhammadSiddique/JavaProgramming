import java.util.Arrays;

class LetterCounter {
    public static void main(String[] args) {
        int array[] = {4,2,7,9,1,6,3,5,8,0};
        int a; int b;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length - 1; j++){
                a = array[j];
                b = array[j+1];
                if(a>b){
                    array[j] = b;
                    array[j+1]= a;
                }
            }
        }
        System.out.println(Arrays.toString(array)); 
    }   
}
