import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int i=s.nextInt();
        int n=1;
        while(n>=1 && n<=10){
            System.out.println(i + "*"+n+"="+(i*n));
            n++;
        }

    }

}
