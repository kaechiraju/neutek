package demo.javamain;

import demo.helper.Bmw;
import demo.helper.Car;
import demo.helper.Tesla;

public class AbstarctTestMain {


    public static void main (String[] str ){

//        Car car= new Car() ;   -->'Car' is abstract; cannot be instantiated

        //Anonymous initialization  --> Adding the  Abstract implementation on during run time.
        //Full implementation -- Implementing all the abstract methods .
        Car imaginaryCar= new Car("god","unknown","BC") {
            @Override
            public String getType() {
                return "imaginary";
            }

            @Override
            public String driveMode() {
                return "devil";
            }

            @Override
            public boolean isAWD() {
                return false;
            }

            @Override
            public boolean hasAutoCurise() {
                return false;
            }
        };

        Bmw bmw_X5= new Bmw("BMW","X5","black","2019");

        Tesla tesla_Y= new Tesla("Tesla","Y","Red","2020");

        Bmw bmw_X7= new Bmw("BMW","X7","White","2020");





    }
}
