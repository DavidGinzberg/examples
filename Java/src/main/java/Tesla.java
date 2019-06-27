

public final class Tesla extends Car{


    static final int MAX_CHARGE = (int)(100 * 1.1);
    private int charge = 100;
    final String color;


    public Tesla(String model){
        super("Tesla", model);
        color = "Black";
    }

    public Tesla(String model, String color){
        super("Tesla", model);
        this.color = color;
    }

    // Not allowed if `drive()` is final in `Car`:
//    @Override
//    public void drive(){
//        System.out.println("Elon says Teslas fly!");
//    }

    public void start(){
        super.start();
        System.out.println("Current charge level is " + charge + " percent.");
        charge--;
        super.drive();
        this.maintain();
    }


    public void maintain(){
        this.charge = 100;
        wash((Vehicle)this);
    }

    public void charge(){
        System.out.println("The Tesla is charging.");
    }

    public static void main(String[] args) {
        final Tesla myTesla = new Tesla( "Model S");
        myTesla.start();
        myTesla.maintain();
        // Not allowed:
        //myTesla = new Tesla("Roadster");

        //Final example
        final int four = 4;
        //not allowed:
        //four = 5;
    }
}
