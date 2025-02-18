import java.util.*;
class Triangle{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a+b+c==180){
            System.out.println("triangle can be formed.");
        }else{
            System.out.println("triangle cannot be formed.");            
        }

    }
}