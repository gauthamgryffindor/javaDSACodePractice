package Pattern;
import java.util.*;
// Sample 1:

// Input:

// n = 4

// Expected output:

// ****

// ***

// **

// *
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }
}
