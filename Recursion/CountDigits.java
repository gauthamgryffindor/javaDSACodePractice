package Recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(353445));
    }
    public static int count(int n){
        if(n<=9){
            return 1;
        }
       return 1+ count(n/10);
       
        
    }
}
