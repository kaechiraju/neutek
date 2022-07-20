package demo.helper;

public abstract class  Truck extends Car{
    public Truck(String model, String colour, String year) {
        super(model, colour, year);
    }

    @Override
    public int numberTiers(){
        return NUMBER_OF_TIERS+2;
    }

    public boolean isATruck(){
        return this instanceof Truck;
    }

}
