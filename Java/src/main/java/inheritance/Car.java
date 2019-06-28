package inheritance;

import inheritance.Tesla;
import inheritance.Vehicle;

public class Car extends Vehicle {
    //Vehicle is a "superclass" of Car; Car is a "subclass" of Vehicle

    //All cars have a make and model defined
    private String make;
    private String model;


    public Car(){
        this("Jeep","Wrangler");
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public final void drive(){
        System.out.println("This car is driving down the road");
    }

    // @Override gives us a double-check that we are overriding an existing method
    @Override
    public void start(){
        System.out.format("This %s %s is started.\n", this.make, this.model);

    }

//    @Override
//    public void wash(Vehicle v){
//
//
//    }

    @Override
    public String toString(){
        return String.format("This car is a %s %s\n", this.make, this.model);
    }

    public static void main(String[] args) {
        Vehicle somebodysRide = new Tesla("Model S");
        Vehicle someoneElsesRide = new Vehicle();
        somebodysRide.start();
        someoneElsesRide.start();
        System.out.println(somebodysRide);
    }
}
