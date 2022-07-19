package demo.javamain;

import demo.helper.Car;

public class AbstarctTestMain {


    public static void main (String[] str ){

//        Car car= new Car() ;   -->'Car' is abstract; cannot be instantiated

        //Anonymous initialization  --> Adding the  Abstract implementation on during run time.
        //Full implementation -- Implementing all the abstract methods .
        Car car= new Car() {
            @Override
            public String getType() {
                return null;
            }

            @Override
            public String driveMode() {
                return null;
            }

            @Override
            public boolean isAWD() {
                return false;
            }
        };

    }
}
