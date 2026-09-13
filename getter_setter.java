/* 
class MyEmployee{
    private float id;
    private String name;

    public void setId(float i){
        this.id = i;
    }

    public float getId(){
        return id;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}

public class getter_setter{
    public static void main(String[] args) {
        MyEmployee Ramesh = new MyEmployee();
        Ramesh.setId(23);
        System.out.prfloatln(Ramesh.getId());
        Ramesh.setName("Ramesh Kumar");
        System.out.prfloatln(Ramesh.getName());
    }
}
*/

class circle{
    private float radius;
    private float diameter;
    private float area;
    private float perimeter;
    
    public void setRadius(float r){
        this.radius = r;
    }

    public float getRadius(){
        return radius;
    }

    public void setDiameter(){
        diameter = 2*radius;
    }

    public float getDiameter(){
        return diameter;
    }

    public void setArea(){
        area = 3.14f*radius*radius;
    }

    public float getArea(){
        return area;
    }

    public void setPerimeter(){
        perimeter = 2*3.14f*radius;
    }

    public float getPerimeter(){
        return perimeter;
    }

}

public class getter_setter{
    public static void main(String[] args) {
        circle cr = new circle();
        cr.setRadius(7);
        cr.setDiameter();
        cr.setPerimeter();
        cr.setArea();
        System.out.println(cr.getDiameter());
        System.out.println(cr.getPerimeter());
        System.out.println(cr.getArea());
    }
}