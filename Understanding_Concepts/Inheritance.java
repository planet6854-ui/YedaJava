class Base{  // 'Base' super class
    private int x;
    
    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("Setting X in Base...");
        this.x = x;
    }
}

class Derived extends Base{  // 'Derived' is a subclass
    private int y;
    
    public int getY(){
        return y;
    }

    public void setY(int y){
        System.out.println("Setting Y in Base...");
        this.y = y;
    }
}
public class Inheritance {
public static void main(String[] args) {
    Base base = new Base();
    Derived derived = new Derived();
    base.setX(34);
    System.out.println(base.getX());

    derived.setY(43);
    System.out.println(derived.getY());

    derived.setX(59);
    System.out.println(derived.getX());
}

}
