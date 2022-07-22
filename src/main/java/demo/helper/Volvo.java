package demo.helper;

public class Volvo extends Truck{
    public Volvo(String model, String colour, String year) {
        super(model, colour, year);
        this.maker="VOLVO";
    }

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
        return true;
    }

    @Override
    public boolean hasAutoCurise() {
        return true;
    }

    public boolean doesHaveSleepBin(){
         return true;
    }


    @Override
    public String toString(){
     return    super.toString()+ "\n======Additional Values from toString in volov =====\ndoesHaveSleepBin : "+ doesHaveSleepBin() + " isATruck : "+isATruck();
    }
}
