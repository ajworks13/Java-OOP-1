

public class Main
{
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.model = "Ferrari F430";
        ferrari.seats = 4;
        ferrari.color = "Red";
        
        ferrari.display();
        
        Car audi = new Car();
        audi.model = "Audi Q5";
        audi.seats = 3;
        audi.color = "Blue";
        
        audi.display();
        
        // Object declaration and memory allocation
        Car test;
        test = new Car(); // gets allocation into a memory.
    }
}
