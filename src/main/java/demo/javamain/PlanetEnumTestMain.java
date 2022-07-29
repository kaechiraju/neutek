package demo.javamain;

public enum PlanetEnumTestMain {
    MERCURY (3.303e+23, 2.4397e6,false),
    VENUS   (4.869e+24, 6.0518e6,false),
    EARTH   (5.976e+24, 6.37814e6,true),
    MARS    (6.421e+23, 3.3972e6,false),
    JUPITER (1.9e+27,   7.1492e7,false),
    SATURN  (5.688e+26, 6.0268e7,false),
    URANUS  (8.686e+25, 2.5559e7,false),
    NEPTUNE (1.024e+26, 2.4746e7,false);

    private final double mass;   // in kilograms
    private final double radius; // in meters



    private final boolean isGoodToLiveON;


    PlanetEnumTestMain(double mass, double radius, boolean isGoodToLiveON) {
        this.mass = mass;
        this.radius = radius;
        this.isGoodToLiveON=isGoodToLiveON;
    }
    private double mass() { return mass; }
    private double radius() { return radius; }

    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Planet <earth_weight>");
            System.exit(-1);
        }
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight/EARTH.surfaceGravity();
        for (PlanetEnumTestMain p : PlanetEnumTestMain.values())  // inherted method "values" .
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }

    public boolean isGoodToLiveON() {
        return isGoodToLiveON;
    }

    //TODO : return MERCURY based of the property .

}