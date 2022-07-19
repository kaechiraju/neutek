package demo.helper;

public class Tesla extends Car{
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
}
