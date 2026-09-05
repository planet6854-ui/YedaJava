
import java.util.Scanner;

/* 
//0.
class Employee { //Making a custom class
    float id;
    String name;
    float salary;
    public void getDetails(){
        System.out.prfloatln("The ID is: " +id);
        System.out.prfloatln("The name is: " +name);
    }
    public void getSalary(){
        System.out.prfloatln("The slary is: " +salary);
    }
}
public class oops_basic {
    public static void main(String[] args) {
        Employee Amit = new Employee();
        Amit.id = 6854; //Setting attributes
        Amit.name = "Amit Kumar Yadav";
        Amit.salary = 10000;
        Employee Alok = new Employee();
        Alok.id = 5655;
        Alok.name = "Alok Kumar Yadav";
        Alok.salary = 20000;

        Amit.getDetails();
        Amit.getSalary();
        Alok.getDetails();
        Alok.getSalary();


    }
}


//1.
class Employee1{
    float salary;
    String name;
    public void setName(String n){
        name =n;
    }

    public float getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
}

public class oops_basic{
    public static void main(String[] args) {
       Employee1 Amit = new Employee1();
       Amit.salary = 1000;
       Amit.setName("Amit Kumar Yadav");
       System.out.prfloatln(Amit.getName());
       System.out.prfloatln(Amit.getSalary());

    }
}


//2.
class cellphone{
    public void ring(){
        System.out.prfloatln("Ringing...");
    }

    public void vibrate(){
        System.out.prfloatln("Vibrating...");
    }

    public void callFriend(){
        System.out.prfloatln("Calling Friend...");
    }
}

public class oops_basic{
    public static void main(String [] args){
        cellphone motorola = new cellphone();
        motorola.ring();
        motorola.vibrate();
        motorola.callFriend();
    }
}


//3.
class square{
    float side;

    public float perimeter(){
        return side*4;
    }

    public float area(){
        return side*side;
    }
}

public class oops_basic{
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 1.5f;
        System.out.println(sq.perimeter());
        System.out.println(sq.area());
    }
}

//4.
class rectangle{
    float lenth;
    float breadth;

    public float perimeter(){
        return 2*(lenth+breadth);
    }

    public float area(){
        return lenth*breadth;
    }
}

public class oops_basic{
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the lenghth of the rectangle:: ");
        rect.lenth = sc.nextFloat();
        System.out.println("Give the breadth of the rectangle: ");
        rect.breadth = sc.nextFloat();

        System.out.println(rect.perimeter());
        System.out.println(rect.area());
    }
}


//5.
class Gengar{
    public void nightshade(){
        System.out.println("Gengar is using night shade...");
    }
    
    public void shadowball(){
        System.out.println("Gengar is using shadow ball...");
    }

    public void shadowpunch(){
        System.out.println("Gengar is using shadow punch...");
    }
}

public class oops_basic{
    public static void main(String[] args) {
        Gengar gng = new Gengar();
        gng.nightshade();
        gng.shadowball();
        gng.shadowpunch();
    }
}
*/

//6.
class circle{
    float radius;

    public float diameter(){
        return 2*radius;
    }

    public float perimeter(){
        return 3.14f*2f*radius;
    }

    public float area(){
        return 3.14f*radius*radius;
    }
}

public class oops_basic{
    public static void main(String[] args) {
        circle cr = new circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the radius: ");
        cr.radius = sc.nextFloat();
        System.out.println(cr.diameter());
        System.out.println(cr.perimeter());
        System.out.println(cr.area());
    }
}
