package Recursion;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(count(353445));
    }
    public static int count(int n){
        if(n<=9){
            return n;
        }
       return n%10 + count(n/10);
       
        
    }

}
