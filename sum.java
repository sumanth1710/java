import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number :");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    //   printSum(arr);
    }
        public static void printArray(int arr[]) {
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");

                sum += arr[i];
                System.out.print("sum of array =" + sum);
            }
System.out.println();
        }
      //  public static int printSum(int[] arr){

     //  for(int i=0; i<arr.length;i++){

    //  }

//return sum;
  //  }

}
