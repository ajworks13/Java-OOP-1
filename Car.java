public class Car{
    
    public String model;
    public String color;
    public int seats;
    
    // Constructor; Should be the same name as class. 
    // Constructors dont have a return type or void.
    Car(String model, String color, int seats){
        this.model = model; // 'this.' points to the variable added before constructor.
        this.color = color;
        this.seats = seats;
    }
    
    
    
    public void display(){
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Seats is " + seats);

        
    }
    /*
    public void intialize(String model_s, String red, int i){
        model = model_s;
        color = red;
        seats = i;
    }
    */
    
}
