package exceptions;

import java.util.*;

public class ExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();

        demo.run();



    }

    public void run() {
        //        String fileDirectory = "notafile.txt";
//        BufferedReader reader = new BufferedReader(new FileReader(fileDirectory));

        ExceptionDemo sp = new ExceptionDemo();
        assert sp != null: "Everything is broken!!!";
        int size = -5;
        int[] myarray;
        try {
            myarray = sp.createArray(size);
        }catch (NegativeArraySizeException ex){
            System.out.println("Hey, you can't use negative numbers for array size!!!");
            System.out.println("You didn't mean to put that negative there, did you?");
            System.out.println("I'll just fix that for you");
            myarray = sp.createArray(size * -1);
        }

        System.out.println("Size of array: " + myarray.length);

        try{
            myarray = sp.createArrayChecked(3);
        }catch (InvalidSizeException isException){
            System.err.println("Got an invalid array size. Creating empty array instead.");
            myarray = sp.createArray(0);
        }

        for (int i = 0; i < myarray.length; i++){
            myarray[i] = sp.getAge();
        }
        System.out.println("Ages:\t" + Arrays.toString(myarray));


        try {
            System.out.println("Calling createArrayAndFill");
            int[] newArray = sp.createArrayAndFill();
            System.out.println("Returned from createArrayAndFill");

            System.out.println("New array:\t" + Arrays.toString(newArray));
        }catch (InvalidSizeException e){
            System.err.println("Something went wrong. Sorry, I tried.");
        }

        System.out.println("Program still running, even if there were problems...");
    }

    public int[] createArray(int size){
        return new int[size];
    }

    // Without the "throws" clause, this wouldn't compile, because `InvalidSizeException
    // is a checked exception
    public int[] createArrayChecked(int size) throws InvalidSizeException{
        if (size < 0){
            throw new InvalidSizeException();
        }
        return new int[size];
    }

    public int[] createArrayAndFill() throws InvalidSizeException{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("How many inputs?");
            int size = sc.nextInt();
            int[] myarray = createArrayChecked(size);

            for (int i = 0; i < myarray.length; i++) {
                myarray[i] = this.getAge();
            }
            System.out.println("About to return from CreateArrayAndFill.");
            return myarray;
        }finally{
            sc.close();
            System.out.println("Scanner is closed.");
        }
    }

    public int getAge(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = 0;
        boolean invalidInput = true;
        while(invalidInput) {
            try {
                age = sc.nextInt();
                invalidInput = false;
            } catch (InputMismatchException ex) {

                System.err.println("You entered an invalid age. You must be new here. Try again.");
//              System.err.println(ex.getMessage());
                sc.nextLine(); //clear the line so we don't get an infinite loop

            }
        }
        return age;
    }
}
