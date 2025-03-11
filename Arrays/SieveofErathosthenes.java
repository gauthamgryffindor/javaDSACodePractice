package Arrays;

import java.util.Scanner;

public class SieveofErathosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(soe(l,r));
    }
    public static int soe(int l,int r){
     int sum=0;
    int[] n=new int[r+1];
    for(int i=2;i*i<=r;i++){
        if(n[i]==0){
            for(int j=i*2;j<=r;j+=i){
                n[j]=1;
            }
        }
    }
    for(int i=l;i<=r;i++){
     if(n[i]==0){
        sum+=i;
     }
    }
     return sum;
    }
}
