class Phone{
    public void Switch(){
        System.out.println("The phone is switched on...");
    }
    
    public void Time(){
        System.out.println("The time is kharab chal raha hain...");
    }

}

class SmartPhone extends Phone{
    public void Switch(){
        System.out.println("The smartphone is switched on...");
    }

    public void Music(){
        System.out.println("The phone is playing music...");
    }
}

public class Dynamic_method_dispatch{
    public static void main(String[] args) {
        // Phone p = new Phone();  ---> It's also allowed
        // SmartPhone sp = new SmartPhone();  ----> It's also allowed
        Phone p = new SmartPhone(); // It's allowed  ---> The Phone is reference class
        // The object formation of p took place at runtime that's why it's dynamic
        //SmartPhone sp = new Phone(); ---> It's NOT allowed
        p.Switch();
        p.Time();
        // p.Music(); ---> This isn't allowed 
        // Only methods of reference class can be operated and that ones overrided

    }
}