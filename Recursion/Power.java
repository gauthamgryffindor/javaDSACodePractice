package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(12,2,1));
        System.out.println(pow1(12,4));//Best Solution
    }
    public static int pow(int n,int m,int i){
            if(i>m){
                return 1;
            }
          return n*pow(n,m,i+1);
          
        }
        public static int pow1(int n,int m){
            if(m==0){
                return 1;
            }
          return n*pow1(n,m-1);
          
        }
}
