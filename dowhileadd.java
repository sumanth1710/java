import java.util.Scanner;
public class dowhileadd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char choice;
        do{
            int a=s.nextInt();
            int b=s.nextInt();

            int sum= a+b;
            System.out.println("Sum of a and b ="+sum);
            System.out.println("Do you want to continue y/n?");
            choice=s.next().charAt(0);
            System.out.println();
        }while(choice=='y' || choice=='N');
    }

}
