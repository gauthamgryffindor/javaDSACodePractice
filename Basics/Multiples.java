import java.util.Scanner;
public class Multiples {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int ans=0,i=1;
        while(ans<=1000){

            ans=x*i;
            if(ans>1000) 
            break;
            System.out.println(ans);
            i++;
        }
    }
}