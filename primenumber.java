import java.util.Scanner;
public class primenumber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
            boolean flag= true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag && n>1){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
    }
    }