// It's practice set for getter, setters, and constructors

class Cylinder{
    private int radius;
    private int height;

    // Problem 1
    /* 
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int h){
        this.height = h;
    }
    public void setRadius( int r ){
        this.radius = r;
    }
    */

    // Problem 3  [using constructer to solve 'Problem 1' constructer]
    public void cylinder(int radius,int height){
        this.radius = radius;
        this.height = height;
    }

    // Problem 2
    public double surfaceArea(){
        return (2*3.142*radius*radius)+(2*3.142*radius*height);
    }
    public double Volume(){
        return 3.142*radius*radius*height;
    }
}

// Problem 4
class rectangle{
    private int length;
    private int breadth;

    public void rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public void rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}

// Problem 5
class sphere{
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return  radius;
    }

    public double Volume(){
        return (4/3)*3.1427*radius*radius*radius;
    }

    public double surfaceArea(){
        return 4*radius*radius*3.1427;
    }
}
public class getSetConst{
    public static void main(String[] args){
        /* 
        // Problem 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(13);
        System.out.println("The radius is"+myCylinder.getRadius());
        System.out.println("The height is: "+myCylinder.getHeight());
        */
        // Problem 2
        Cylinder myCylinder = new Cylinder();
        // Problem 3
        myCylinder.cylinder(9, 12);
        // 2 Continued...
        System.out.println("The surface area of the cylinder is: " +myCylinder.surfaceArea());
        System.out.println("The Volume of the cylinder is: " +myCylinder.Volume());

        // Problem 4
        rectangle myRectangle = new rectangle();
        myRectangle.rectangle(12,13);
        System.out.println("The length is: " +myRectangle.getLength());
        System.out.println("The breadth is: " +myRectangle.getBreadth());

        // Problem 5
        sphere mySphere = new sphere();
        mySphere.setRadius(14);
        System.out.println("The radius is: " +mySphere.getRadius());
        System.out.println("The volume is: " +mySphere.Volume());
        System.out.println("The surafce area is: " +mySphere.surfaceArea());
        
    }
}