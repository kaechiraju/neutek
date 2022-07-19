package demo.javamain;

import demo.helper.SubClass;
import demo.helper.SuperClass;

public class SuperSubTesterMain {

    public static void main(String[] stringArr) {
        SuperClass sc = new SuperClass(1, 2, 3);

        SuperClass sc2 = new SuperClass(4, 5, 6, 7, 8, 9);

        SubClass sb1 = new SubClass(10, 12, 13);

        SubClass sb2 = new SubClass(21, 22, 23, 24, 25, 26);


        if (sc instanceof SuperClass) {
            System.out.println("YES ,SC is instanceof SuperClass");
        }

        if (sb1 instanceof SuperClass) {
            System.out.println("YES ,SB(subClass) is instanceof SuperClass");
        } else {
            System.out.println("NO, SB(subClass) is Not instanceof SuperClass");
        }


        if (sc instanceof SubClass) {
            System.out.println("YES ,SC(SuperClass) is instanceof SubClass");
        } else {
            System.out.println("NO, SC(SuperClass) is Not instanceof SubClass");
        }

        System.out.println("\n ****************SUM and toString of object.java ********");

        System.out.println("Values in  super class   sc     sc.toString()  " + sc.toString());
        System.out.println("Values in  super class  sc2     sc2.toString())  " + sc2.toString());
        System.out.println("Calling super class sum  sc     sc.sum() " + sc.sum());
        System.out.println("Calling super class sum  sc2    sc2.sum() " + sc2.sum());

        System.out.println("Values in  Sub class  sb1   sb1.toString()  \n" + sb1.toString());
        System.out.println("Values in  Sub class  sb2   sb2.toString() \n" + sb2.toString());
        System.out.println("Calling super class sum   sb1   sb1.sum()  " + sb1.sum());
        System.out.println("Calling super class sum   sc2    sb2.sum() " + sb2.sum());


        System.out.println("\n ****************Diff( Access modifer) ********");


//        System.out.println("Calling super class Diff   sb1   sb1.sum()  "+sb1.diff());? ERROR !!! with Diff as it is marked priavte in super class it could not be overried in sub class. Though subclass allowed same name in subclass . during run it cannot decided which one invoke .
        System.out.println("Calling sub class     dif    sb1.subClassDiff() " + sb1.subClassDiff());
        System.out.println("Calling sub class     dif    sb2.subClassDiff() " + sb2.subClassDiff());
        System.out.println("Calling sub class     myOwnOperation    sb1.myOwnOperation() " + sb1.myOwnOperation());
        System.out.println("Calling sub class     myOwnOperation    sb2.myOwnOperation() " + sb2.myOwnOperation());


        SuperClass typeCastedInstanceOfSuperClass=(SuperClass) sb1;


//        System.out.println("Calling  sum class  myOwnOperation    on typeCastedInstanceOfSubClass " + typeCastedInstanceOfSuperClass.myOwnOperation()); Error!!! TODO:


        System.out.println("" ) ;
        System.out.println("\n SUPER CLASS REFERNCE OF A SUB CLASS TYPE   ::: typeCastedInstanceOfSubClass   -->  SuperClass typeCastedInstanceOfSuperClass=(SuperClass) sb1  ****" ) ;
        System.out.println("Calling  sum class  Sum    on typeCastedInstanceOfSubClass " + typeCastedInstanceOfSuperClass.sum());

        System.out.println("typeCastedInstanceOfSuperClass is instantof SuperClass  " + (typeCastedInstanceOfSuperClass instanceof SuperClass));

        System.out.println("typeCastedInstanceOfSuperClass is instantof SubClass  " + (typeCastedInstanceOfSuperClass instanceof SubClass));




        SubClass typeCastedInstanceOfSubClass=(SubClass) sc2;

        System.out.println("Calling  sum class  myOwnOperation    on typeCastedInstanceOfSubClass " + typeCastedInstanceOfSubClass.myOwnOperation());
        typeCastedInstanceOfSubClass.myOwnOperation();




    }
}
