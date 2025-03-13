package Recursion;

public class CheckSort {
    public static void main(String[] args) {
    int a[]={1,3,5,9};
     boolean a1= sortArr(a,0);
     System.out.println(a1?"sorted":"not sorted");
      
    }
        public static boolean sortArr(int n[],int i){
            if(i==n.length-1){
                return true;
            }
          if(n[i]>n[i+1]){
                      return false; 
          }
          return sortArr(n,i+1);
          
        }
}
