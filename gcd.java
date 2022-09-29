import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int g=1;
        for(int i=1;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        System.out.println("HCF ="+g);
    }
}
