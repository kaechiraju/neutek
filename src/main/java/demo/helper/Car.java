package demo.helper;

public abstract class Car {

    //SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  //Cannot resolve symbol 'TUESDAY'


    protected static final int NUMBER_OF_TIERS = 4;
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

    @Override
    public String toString(){

        StringBuffer sb= new StringBuffer();

        sb.append("\n==========maker: "+ maker+ " model :"+ model + " colour :"+ colour  +" year:" +year +"===========");

        sb.append("\n"+ "hasHeadLights : "+ hasHeadLights() + " numberTiers :"+ numberTiers() );

        sb.append("\n"+ "getType : "+ getType() + " driveMode :"+ numberTiers() + " driveMode : "+driveMode() +" isAWD: "+isAWD() + " hasAutoCurise "+ hasAutoCurise() );

        sb.append("\n==================================================================================================");

        return sb.toString();
    }


}
