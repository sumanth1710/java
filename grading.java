import java.util.Scanner;
public class grading {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter marks of the student =");
        int m=s.nextInt();
        if(m<=25)
            System.out.print(m+"your grade is = F");
        else if(m>25 && m<45)
            System.out.print(m+" your grade is = E");
            else if(m>45 && m<50)
                System.out.print(m+" your grade is = D");
            else if(m>50 && m<60)
                System.out.print(m+"ur garde is C");
            else if(m>60 && m<70)
                System.out.print(m+"ur grade is B");
            else if(m>70 && m<80)
                System.out.print(m+"ur grade is A");
            else if(m>80)
                System.out.print(m+"ur grade is O(outstanding)");



    }

}
