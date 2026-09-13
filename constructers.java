class MyMainEmployee{
    private int id;
    private String name;
    
    // Constructer: It is used to initialize an object while creating it.
    // Here, a member function is used to do so.
    // To define a constructer we define a method with a name same as the name of the class.
    public MyMainEmployee(){         // This is a constructer
        id = 45;
        name = "Vijay Anna";
    }

    public String getName(){return name;}
    public void setName(String n){this.name = n;}   
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}

// Constructor overloading:
// Constructer overloading means same name of class is used many times with different arguements.

class Student{
    private String name;
    private int id;
    
    // Constructor 1:
    public Student(String n){
        id = 45;
        name = n;
    }

    // Constructor 2:
    public Student(int i){
        id = i;
        name = "Sameer";
    }

    // Constructor 3:
    public Student(String na, int I){
        id = I;
        name = na;
    }

    public void stdDetails(){
        System.out.println("The name is: "+name);
        System.out.println("The ID is: "+id);
    }
}

// To run them:

public class constructers {
    public static void main(String[] args) {
        MyMainEmployee Amit = new MyMainEmployee();
        Amit.setId(54);             // Here Updation of Data is taking place
        Amit.setName("RajniKant"); 
        System.out.println(Amit.getId());
        System.out.println(Amit.getName());

        Student S1 = new Student(7);
        Student S2 = new Student("Soham");
        Student S3 = new Student("Kira", 47);
        S1.stdDetails();
        S2.stdDetails();
        S3.stdDetails();
    }
}
