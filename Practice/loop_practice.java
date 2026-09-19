import java.util.Scanner;

public class loop_practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1.
        /* 
        int n;
        System.out.println("Enter the number of rows you want to print: ");
        n = sc.nextInt();
        for(int i = n ; i>0 ; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        */

        //2.
        //i. With while loop
        /* 
        int n,i=0;
        int sum =0;
        System.out.println("Enter the number till where you want the sum of all the even numbers: ");
        n = sc.nextInt();
        while(i<n){
            sum = sum + i;
            i = i+2;
        }
        System.out.println("The sum is: " +sum);
        */

        //ii. With for loop
        /* 
        int n;
        int sum =0;
        System.out.println("Enter the number till where you want the sum of all the even numbers: ");
        n = sc.nextInt();
        for(int i = 0; i<=n; i+=2){
            sum = sum + i;
        }
        System.out.println("The sum is: " +sum);
        */

        //3.
        /* 
        int n;
        System.out.println("Enter the number whose table you want: ");
        n = sc.nextInt();
        System.out.println("The table:");
        for(int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d\n" ,n,i,n*i);
        }
        */
    }
}