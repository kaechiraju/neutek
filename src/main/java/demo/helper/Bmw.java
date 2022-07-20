package demo.helper;

public class Bmw extends Car{

    public Bmw(String maker, String model, String colour, String year) {
        super(maker, model, colour, year);
    }

    public Bmw( String model, String colour, String year) {
        super( model, colour, year);
        this.maker="BMW";
    }

    @Override
    public String getType() {
        return "GAS";
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
        return true;
    }
}
