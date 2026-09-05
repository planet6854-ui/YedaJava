class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
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
        System.out.println(Ramesh.getId());
        Ramesh.setName("Ramesh Kumar");
        System.out.println(Ramesh.getName());
    }
}