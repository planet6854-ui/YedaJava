// Method overriding is that a method is being used in another class with a bit modification (The modifications follows some rules)
// This concept is different from method overloading which was to be used in same class after the change of arguements 
class Alpha{
    public int mthd1(){
        return 4;
    }

    public void mthd2(){
        System.out.println("It's method 2 of Alpha!!");
    }
}

class Beta extends Alpha{
    public int mthd3(){
        return 5;
    }

    public void mthd4(){
        System.out.println("It's method 3 of Beta!!");
    }

    // Here we are overriding a method
    @Override 
    public void mthd2(){
        System.out.println("It's method 2 of Beta!!");
    }
}

public class method_overriding{
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        a.mthd2();
        b.mthd2();
    }
}