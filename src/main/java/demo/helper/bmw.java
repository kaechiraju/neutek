package demo.helper;

public class bmw extends Car{
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
}
