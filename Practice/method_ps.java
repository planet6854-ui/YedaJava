

public class method_ps {

    //1. Multiplication table
    static void table(int n){
        for(int i=0 ; i<=10 ; i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }

    //2. 
    static void pattern(int n){
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");   
            }
            System.out.println("");
        }
    }

    //3.
    static int recursive_sum(int n){ // imp!!: Here we have used "int" because we to return an integer from the function
        if(n==1){
            return 1;
        }
        return (n + recursive_sum(n-1));
    }

    //4.
    static void pattern1(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");   
            }
            System.out.println("");
        }
    }

    //5.
    static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if( n==2){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    //6.
    static int avg(int... arr){
        int count =0;
        int result = 0;
        for (int a : arr) {
            count = count +1;
            result = result + a;   
        }
        return result / count;
    }

    //7.
    static void patter_rec(int n){
        if(n>0){
            patter_rec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    //8.
    static void pattern1_rec(int n){
        if(n>0){
            for (int i = n; i>=0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern1_rec(n-1);
        }
    }

    //9.
    static void temp(float c){
        float fah;
        fah = (c*1.8f) + 32f;
        System.out.println("The temperature in Fahreinheit is: " + fah);
    }

    //10.
    static void normal_sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }


    public static void main(String[] args) {
        /* 
        //1.
        table(7);

        //2.
        pattern(7);

        //3.
        System.out.println(recursive_sum(5));
        
        //4.
        pattern1(5);
        
        //5.
        System.out.println(fibonacci(5));
        
       //6.
       System.out.println(avg(10,20,30,40,50));
       
       //7.
       patter_rec(5);
       
       //8.
       pattern1_rec(5);
       
       //9. 
       temp(100);
       */
       //10.
       normal_sum(10);


    }
}
    
       

