package Recursion;

public class Divisor {
    public static void main(String[] args) {
        divisor(12,1);
      
    }
        public static void divisor(int n,int i){
            if(i==n+1){
                return;
            }
          if(n%i==0)
             System.out.println(i);
          divisor(n,i+1);
          
        }
}
