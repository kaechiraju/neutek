package demo.helper;

public class SubClass extends SuperClass {

    private int x;
    private int y;
    private int z;
    private int a;
    private int b;
    private int c;

    public SubClass(int x, int y, int z) {
        super(x, y, z);
        System.out.println("Constructor with x y z  in SUB class is called .");
        this.x = x;
        this.y = y;
        this.z = z;
        a = x;
        b = y;
        c = z;
    }


    public SubClass(int x, int y, int z, int a, int b, int c) {
        super(x, y, z, a, b, c);
        System.out.println("Constructor with x y z and a b c in SUB class is called .");
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int sum() {
        return x + y + z + a + b + c;
    }


    @Override
    public String toString() {
        return "X= " + x + " Y= " + y + " Z= " + z + " \nA= " + a + " B= " + b + " C= " + c;
    }

    private int diff() {
        return x - y - z;
    }

    public int subClassDiff() {
        return x - y - z;
    }

    @Override
    protected int multiple() {
        return x * y * z;
    }

    public int myOwnOperation(){
        return  subClassDiff()-multiple();
    }


}
