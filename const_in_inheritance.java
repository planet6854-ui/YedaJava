class Parent{

    public Parent() {
        System.out.println("Parent constructor with any arguement!!");
    }
    
    public Parent(int x) {      // Overloading the constructor
        System.out.println("Parent constructor with arguement: "+x);
    }
}

class child extends Parent{
    public child(){
        System.out.println("Child class without arguement!!");
    }
    public child(int x, int y){
        super(x);        // Calling super class ( Focus here !! )
        System.out.println("Child class with arguements:" +y);
    }

}

class grandchild extends child {
    public grandchild(){
        System.out.println("Grandchild without arguement!!");
    }
    public grandchild(int x, int y, int z){
        super(x,y);
        System.out.println("Grandchild with arguements: " +z);
    }
}

public class const_in_inheritance {
    public static void main(String[] args) {
        grandchild Gc = new grandchild(5,6,7);
    }
}
