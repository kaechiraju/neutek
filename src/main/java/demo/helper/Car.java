package demo.helper;

public abstract class Car {

    public static final int NUMBER_OF_TIERS = 4;
    String Maker;
    String Model;
    String colour;
    String year;


    public Car() {
    }


    public Car(String Maker, String Model, String colour,  String year) {
    }


    public boolean hasHeadLights(){
        return true;
    }

    public int nuberTiers(){
        return NUMBER_OF_TIERS;
    }

    public abstract String getType();

    public abstract String driveMode();

    public abstract boolean isAWD();


    public String getMaker() {
        return Maker;
    }

    public String getModel() {
        return Model;
    }

    public String getColour() {
        return colour;
    }

    public String getYear() {
        return year;
    }


    public void setMaker(String maker) {
        Maker = maker;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
