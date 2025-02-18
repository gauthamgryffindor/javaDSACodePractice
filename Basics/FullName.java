import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstname=scan.next();
        String lastname=scan.next();
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(firstname+lastname);
        }
    }
}
