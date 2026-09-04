class Employee { //Making a custom class
    int id;
    String name;
    int salary;
    public void getDetails(){
        System.out.println("The ID is: " +id);
        System.out.println("The name is: " +name);
    }
    public void getSalary(){
        System.out.println("The slary is: " +salary);
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
