import java.util.Scanner;
public class Greatest {
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        System.out.print("Enter first value= ");
        int n1=g.nextInt();
        System.out.print("Enter second value= ");
        int n2=g.nextInt();
        if(n1>n2)
            System.out.print(n1+" is greater than "+n2);
        else
            System.out.print(n2+" is greater than "+n1);
    }
}
