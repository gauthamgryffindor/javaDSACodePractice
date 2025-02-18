import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        scan.nextLine();
        String name=scan.nextLine();
        char letter=scan.next().charAt(0);
        System.out.println(number);
        System.out.println(name);
        System.out.println(letter);
    }
}