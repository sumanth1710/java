import java.util.Scanner;
public class companybonus {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the salaray =");
        int x=s.nextInt();
        System.out.print("Enter year of joining = ");
        int y=s.nextInt();
        if(y<=2018)
            System.out.print("you are eligible for bonus of "+((x/100)*5)+" And ur net bonus amount is "+(((x/100)*5)*12)+" Ur gross salary is"+((((x/100)*5))+x));
        else
            System.out.print("sorry..! ur not eligible for bonus and your salary is ="+x);


    }
}
