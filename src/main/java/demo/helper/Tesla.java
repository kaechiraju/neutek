package demo.helper;

public class Tesla extends Car{

    public Tesla(String maker, String model, String colour, String year) {
        super(maker, model, colour, year);
    }

    public Tesla(  String model, String colour, String year) {
        super( "TESLA", model, colour, year);
     }




    @Override
    public String getType() {
        return "ELECTRICAL";
    }

    @Override
    public String driveMode() {
        return "AUTOMATIC";
    }

    @Override
    public boolean isAWD() {
        return true;
    }

    @Override
    public boolean hasAutoCurise() {
        return false;
    }
}
