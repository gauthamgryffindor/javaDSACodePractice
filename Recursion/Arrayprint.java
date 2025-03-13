package Recursion;

public class Arrayprint {
    public static void main(String[] args) {
        int a[]={1,3,5,9,6,4,3,2};
      printArr(a,0);
      
    }
        public static void printArr(int n[],int i){
            if(i==n.length){
                return;
            }
          System.out.println(n[i]);
           printArr(n,i+1);
            
        }
}
