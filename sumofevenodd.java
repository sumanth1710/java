import java.util.Scanner;
public class sumofevenodd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=s.nextInt();
        int even =0;
        int odd=0;
       for(int i=1 ; i<=n ; i++){
           if(i%2==0){
               even+=i;
           }
           else{
               odd+=i;
           }
       }
       System.out.println("Sum off even numbers ="+even);
       System.out.println("Sum of odd numbers ="+odd);
       System.out.println();
       System.out.println(".....SUCCESS...!");
    }
}
