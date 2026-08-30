
public class cwh_29_PS_6_2{
    public static void main(String[] args){
        //pROBLEM2
        /* 
        int [] marks ;
        int num,n;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number of numbers:\n");
        n = sc.nextInt();
        marks = new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the number to check:");
        num = sc.nextInt();
        for(int i=0; i<n; i++){
            if(num == marks[i]){
                System.out.println("FOUND!!!");
                break;
            }
        }
        if(!found){
            System.out.println("NOT FOUND!!!");
        }*/



       // PROBLEM3
       /*Scanner sc = new Scanner(System.in);
       float []  marks;
       float sum = 0.0f, avg,total;
       int n;
       System.out.println("Enter the number of students in the class");
       n = sc.nextInt();
       marks = new float[n];
       System.out.println("Enter the marks of the students:");
       for(int i = 0; i<n; i++){
        marks[i] = sc.nextFloat();
        sum = sum + marks[i];
       }
       total= sum;
       avg = (float)total/n;
       System.out.println("The average is:" +avg);*/

       //Problem4
       /* 
       Scanner sc = new Scanner(System.in);
       int [][] A;
       int [][] B;
       int [][] sum;
       int m,n;
       System.out.println("Enter the number of rows:");
       m = sc.nextInt();
       System.out.println("Enter the number of columns:");
       n = sc.nextInt();
       A = new int[m][n];
       B = new int[m][n];
       sum = new int[m][n];
       System.out.println("                            ");
       System.out.println("----------------------------");
       System.out.println("----------------------------");
       System.out.println("                            ");
       System.out.println("Enter the elements in A:");
       for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            System.out.printf("Element at %d row and %d column:\n",i,j);
            A[i][j] = sc.nextInt();
        }
       }
       System.out.println("                            ");
       System.out.println("----------------------------");
       System.out.println("----------------------------");
       System.out.println("                            ");
       System.out.println("Enter the elements in B:");
       for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            System.out.printf("Element at %d row and %d column:\n",i,j);
            B[i][j] = sc.nextInt();
        }
       }
      tem.out.println("----------------------------");
       S System.out.println("                            ");
       System.out.println("----------------------------");
       System.out.println("                            ");
       System.out.println("The sum of the matrices is:");
       for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            sum[i][j] = A[i][j] + B[i][j];
        }
       }
       for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            System.out.printf("Element at %d row and %d column:\n",i,j);
            System.out.println(sum[i][j]);
        }
       }
        */
       
       // Problem 5
       /* 
       Scanner sc = new Scanner(System.in);
       int arr[];
       int n;
       System.out.println("Give the number of elements:");
       n = sc.nextInt();
       arr = new int[n];
       System.out.println("Give the elements:");
       for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
       }
       System.out.println("----------------------------");
       System.out.println("                            ");
       System.out.println("Reversed array:");
       for(int i = (n-1); i >=0; i--){
        System.out.println(arr[i]);
       }
        */

       // Problem 6  
       /*
       Scanner sc = new Scanner(System.in);
       int [] arr;
       int n;
       System.out.println("Give the number of elements:");
       n = sc.nextInt();
       arr = new int[n];
       System.out.println("Give the elements:");
       for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
       }
       int min = arr[0];
       for(int i = 0; i < n; i++){
        if(arr[i]>min){
            min = arr[i];
        }
       }
       System.out.println("----------------------------");
       System.out.println("                            ");
       System.out.print("The maximum element is:");
       System.out.println(min);
       */

       //Problem 7
       /* 
       Scanner sc = new Scanner(System.in);
       int [] arr;
       int n;
       System.out.println("Give the number of elements:");
       n = sc.nextInt();
       arr = new int[n];
       System.out.println("Give the elements:");
       for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
       }
       int min = arr[0];
       for(int i = 0; i < n; i++){
        if(arr[i]<min){
            min = arr[i];
        }
       }
       System.out.println("----------------------------");
       System.out.println("                            ");
       System.out.print("The minimum element is:");
       System.out.println(min);
       */

       // Problem 8 (To find whether the array is sorted or not)
       /* 
       Scanner sc = new Scanner(System.in);
       int [] arr;
       int n;
       System.out.println("Give the number of elements:");
       n = sc.nextInt();
       arr = new int[n];
       System.out.println("Give the elements:");
       for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
       }
       boolean sorted = false;
       for(int i =1; i<n; i++){
        if(arr[i] > arr[i-1]){
            sorted = true;
            break;
        }
       }
       if(sorted){
        System.out.println("The array is sorted");
       }
       else{
        System.out.println("The array isn't sorted");
       }
       */
       }
    }