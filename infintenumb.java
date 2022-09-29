import java.util.Scanner;
public class infintenumb {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,
        countPositive=0,
        countnegative=0,
        countzeros=0;
        char choice;
        do{
            System.out.println("Enter numb :");
            n=s.nextInt();
            if(n>0){
                countPositive++;
            }
            else if(n<0){
                countnegative++;
            }
            else {
                countzeros++;
            }
            System.out.println("Do you want to continue yes/no? ");
            choice=s.next() .charAt(0);
        }while(choice=='y' || choice=='y');
        System.out.println("Positive count =" + countPositive);
        System.out.println("Negative count =" +countnegative);
        System.out.println("Zero count =" +countzeros);


    }
}
