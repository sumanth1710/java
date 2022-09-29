//Print number between 1 and 10
import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the number :");
            n = s.nextInt();
        }while(n<1 || n>10);
        System.out.println(n+"Number is between 1 and 10 :");
    }
}
