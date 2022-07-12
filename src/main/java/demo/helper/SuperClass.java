package demo.helper;

public class SuperClass {

    private int x ;
    private int y ;
    private int z ;
    private int a;
    private int b;
    private int c;

    public SuperClass(int x, int y, int z) {
        System.out.println("Constructor with x y z  in super class is called .");

        this.x = x;
        this.y = y;
        this.z = z;

        a=x;
        b=y;
        c=z;
    }


    public SuperClass(int x, int y, int z, int a, int b, int c) {
        System.out.println("Constructor with x y z and a b c   in super class is called .");
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
        this.c = c;
    }


//    public SuperClass(){
//        super();
//    }



    public int sum( ){
        System.out.println("Method i super class is called .");
        return 0;
    }






}
