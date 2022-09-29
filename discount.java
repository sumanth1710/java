import java.util.Scanner;
public class discount {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter customer quantity= ");
        int x=s.nextInt();
        if((x*100)>1000)
            System.out.print("Congrats..! you got discount of "+(x*10)+" And your total cost is"+(x*100-(x*10)));
        else
            System.out.print("you not eligible for any discount and your total cost is = "+(x*100));
    }
}
