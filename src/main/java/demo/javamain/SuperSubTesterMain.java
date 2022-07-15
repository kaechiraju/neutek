package demo.javamain;

import demo.helper.SubClass;
import demo.helper.SuperClass;

public class SuperSubTesterMain {

    public static void main(String[] stringArr)
    {
        SuperClass sc= new SuperClass(1,2,3);

        SuperClass sc2= new SuperClass(4,5,6,7,8,9);

        SubClass sb1= new SubClass(10,12,13);

        SubClass sb2= new SubClass(21,22,23,24,25,26);


        if( sc instanceof SuperClass){
            System.out.println("YES ,SC is instanceof SuperClass");
        }

        if(sb1 instanceof SuperClass ){
            System.out.println("YES ,SB(subClass) is instanceof SuperClass");
        }else{
            System.out.println("NO, SB(subClass) is Not instanceof SuperClass");
        }

        System.out.println("\n ****************SUM ********");

        System.out.println("Values in  super class   sc     sc.toString()  "+sc.toString());
        System.out.println("Values in  super class  sc2     sc2.toString())  "+sc2.toString());
        System.out.println("Calling super class sum  sc     sc.sum() "+sc.sum());
        System.out.println("Calling super class sum  sc2    sc2.sum() "+sc2.sum());

        System.out.println("Values in  Sub class  sb1   sb1.toString()  \n"+sb1.toString());
        System.out.println("Values in  Sub class  sb2   sb2.toString() \n"+sb2.toString());
        System.out.println("Calling super class sum   sb1   sb1.sum()  "+sb1.sum());
        System.out.println("Calling super class sum   sc2    sb2.sum() "+sb2.sum());


    }
}
