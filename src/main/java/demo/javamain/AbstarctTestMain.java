package demo.javamain;

import demo.helper.*;

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

        Truck truck= new Truck("6Wheel","White","2020") {
            @Override
            public String getType() {
                return "GAS";
            }

            @Override
            public String driveMode() {
                return "MANUAL";
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


        Truck volvo= new Volvo("6Wheel","White","2020");

        Object object= new Object();
        System.out.println( "Object.toString() --> "+object.toString()  );
        System.out.println( "Object            --> "+ object );

        System.out.println( "imaginaryCar --> "+ imaginaryCar );
        System.out.println( "bmw_X5 --> "+ bmw_X5 );
        System.out.println( "tesla_Y --> "+ tesla_Y );
        System.out.println( "bmw_X7 --> "+ bmw_X7 );
        System.out.println( "truck --> "+ truck );
        System.out.println( "volvo --> "+ volvo );

    }
}
