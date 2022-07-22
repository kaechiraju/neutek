package demo.javamain;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class DiffrentWayToIntilaizeClassMain implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    public DiffrentWayToIntilaizeClassMain() {
        log("Hello! CrunchifyObj() just got created..");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (DiffrentWayToIntilaizeClassMain) super.clone();
    }

    @SuppressWarnings({ "unused", "resource", "rawtypes" })
    public static void main(String[] args) throws Exception {

        // Create Object1
        DiffrentWayToIntilaizeClassMain object1 = new DiffrentWayToIntilaizeClassMain();

        // Create Object2
        DiffrentWayToIntilaizeClassMain object2 = (DiffrentWayToIntilaizeClassMain) Class.forName("demo.javamain.DiffrentWayToIntilaizeClassMain").newInstance();

        // Create Object3
        DiffrentWayToIntilaizeClassMain secondObject = new DiffrentWayToIntilaizeClassMain();
        DiffrentWayToIntilaizeClassMain object3 = (DiffrentWayToIntilaizeClassMain) secondObject.clone();

        // Create Object4
        Object object4 = DiffrentWayToIntilaizeClassMain.class.getClassLoader().loadClass("demo.javamain.DiffrentWayToIntilaizeClassMain")
                .newInstance();

        // Create Object5: Create a new file with an ObjectOutputStream
        FileOutputStream out = new FileOutputStream("DiffrentWayToIntilaizeClass.txt");
        ObjectOutputStream oout = new ObjectOutputStream(out);
        oout.writeObject(object4); // write object4 to file
        oout.flush();

        // create an ObjectInputStream for the file we created before
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DiffrentWayToIntilaizeClass.txt"));
        DiffrentWayToIntilaizeClassMain object5 = (DiffrentWayToIntilaizeClassMain) ois.readObject();
        log(object5.toString());

        // Create Object6: use the Constructor class from the java.lang.reflect
        Class clazz = DiffrentWayToIntilaizeClassMain.class;
        Constructor crunchifyCon = clazz.getDeclaredConstructors()[0];
        DiffrentWayToIntilaizeClassMain obj = (DiffrentWayToIntilaizeClassMain) crunchifyCon.newInstance();
    }

    private static void log(String object) {
        System.out.println(object);

    }
}