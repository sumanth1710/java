import java.util.Scanner;
public class exe2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sum=0;
     //   while(true){
        //    System.out.println("Enter the number =");
      //      sum += s.nextInt();

      //      if (sum > 100)
         //       break;
    //    }
        do{
            System.out.println("Enter  the number  =");
            sum+=s.nextInt();
        }while(sum<=100);
        System.out.print("Done "+sum);
    }

}
