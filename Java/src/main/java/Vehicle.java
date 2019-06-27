public class Vehicle {

    public static void main(String[] args){

        Vehicle car = new Vehicle();

        System.out.println(car);


    }

    public final void wash(Vehicle v){
        VehicleWash vWash = new VehicleWash();
        vWash.wash(v);
    }


    public void start(){
        System.out.println("This vehicle has started");
    }

    @Override
    public String toString(){
        return "This is a vehicle";
    }
}
