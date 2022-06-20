public class Main
{
    /*
    NOTES:
    Car - Super class or parent class or base class.
    Ferrari - Sub class or child class or derived class.
    
    */
    
    public static void main(String[] args) {
        Car c = new Car();
        c.display(); // outputs 'in parent class'.
        System.out.println(c.seats); // 4.
        
        Ferrari f = new Ferrari();
        f.displayFerrari(); // ferrari exclusive method.
        f.display(); // from Car parent class inherited.
        System.out.println(f.seats); // 4.
        
        // referencing from a child class instead of parent.
        Car cf = new Ferrari();
        System.out.println("CF : " + cf.seats); // CF : 4.
        cf.display();
        
        // Ferrari fc = new Car(); // wont work.
        
    }
}
