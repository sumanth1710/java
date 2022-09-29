import java.util.Scanner;
public class whileexmp01 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number =");
        int n=s.nextInt();
        while(n<1 || n>10){
            System.out.println(n+" is not in between 1 and 10 so, kindly try again...");
            n=s.nextInt();
        }
        System.out.println(n+" is in btw 1 and 10...");

    }
}
