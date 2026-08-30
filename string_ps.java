import java.util.Scanner;
public class string_ps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the string:");
        
        //1.
        /* 
        String sample = sc.next(); // next() would only store 'Amit' even if you typed 'Amit Kumar Yadav'
        System.out.println(sample.toLowerCase());
        */

        //2.
        /* 
        String sample = "    Amit     Kumar";
        System.out.println(sample.replace(' ', '_'));
        */

        //3.
        /* 
        String letter = "Dear name thanks a lot";
        System.out.println("Give the name you to be there:");
        String rplc = sc.next();
        letter = letter.replace("name", rplc);
        System.out.println("Now, it is: ");
        System.out.println(letter);
        */

        //4.
        /* 
        String sample = "Amit   Kumar        Yadav ISBMCOE   SE";
        System.out.println("To check triple space:");
        System.out.println(sample.contains("   "));
        System.out.println("To check double space:");
        System.out.println(sample.contains("  "));
        */

        
    }
}