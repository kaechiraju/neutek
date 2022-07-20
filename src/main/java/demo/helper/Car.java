package demo.helper;

public abstract class Car {

    public static final int NUMBER_OF_TIERS = 4;
    public  String  maker = "Anonamous";


    String model;
    String colour;
    String year;


//    public Car() {
//    }


    public Car(String maker, String model, String colour,  String year) {
        this.maker =maker;
        this.colour=colour;
        this.year=year;
        this.model=model;
    }

    public Car( String model, String colour,  String year) {

        this.colour=colour;
        this.year=year;
        this.model=model;
    }


    public boolean hasHeadLights(){
        return true;
    }

    public int numberTiers(){
        return NUMBER_OF_TIERS;
    }

    public abstract String getType();

    public abstract String driveMode();

    public abstract boolean isAWD();

    public abstract boolean hasAutoCurise();


    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getYear() {
        return year;
    }


    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
