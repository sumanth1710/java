import java.util.Scanner;
public class factoria {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number =");
        int n=s.nextInt();
        int fact=1;
        int i=1;
        while(i>=1 && i<=n){
            fact *=i;
            i++;
        }
        System.out.println("Factorial :"+fact);
    }
}

