// Methods are just as functions of java classes, but they are associated with an object of that class. They can access and modify the object's state (its fields) and can be called on instances of the class. Methods can also take parameters and return values, allowing for more complex behavior and interaction between objects.
//Syntax: static dataType methodName(parameters) {
    // method body
    // code to be executed
    //return value; 
//Calling: where_you_want_to_store = Method_Name(parameters); // Also it is being called with the objects of the class
//Here, where_you... is an object through which the method is being called, and Method_Name is the name of the method being invoked. 
//"static" makes it possible to share a single method with all instances of the class, rather than having each instance have its own copy of the method. 
//class_name obj = new class_name(); // creating an object of the class
//c = obj.methodName(parameters); // calling the method using the object of the class

import java.util.Scanner;
public class method{
    //For finding even and odd
    static String evenodd(int n) {
        String result;
        if((n%2) == 0){
            result= "Even";
        }
        else{
            result= "Odd";
        }
        return result;
    }


    //For checking if prime number 
    static boolean prime(int n){
        boolean result1 = true;
        if(n<=1){
            result1 = false;
        }
        
        for(int i=2; i<n ; i++){
            if((n%2)==0){
                result1 = false;
                break;
            }
        }
        return result1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("=== Even-Odd Checker ===");
        System.out.println(evenodd(n));
        System.out.println("=== Prime Checker ===");
        System.out.println(prime(n));
    }
}