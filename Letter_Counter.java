/*
Write a Java program to count the number of occurrences of a specific character in a given string.
*/

class LetterCounter {
    public static int letterCounter(String word, char letter){
        int counter = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == letter){
                counter++;
            } 
        }
        return counter;
    }
    
    public static void main(String[] args) {
        int result = letterCounter("My name is Huzaifa and who are you?", 'a');
        System.out.println(result);
    }
    
    
}
