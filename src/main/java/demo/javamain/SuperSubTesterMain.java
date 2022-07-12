package demo.javamain;

import demo.helper.SubClass;
import demo.helper.SuperClass;

public class SuperSubTesterMain {

    public static void main(String[] stringArr)
    {
        SuperClass sc= new SuperClass(1,2,3);

        SuperClass sc2= new SuperClass(1,2,3,4,5,6);

        SubClass sb1= new SubClass(1,2,3);

        SubClass sb2= new SubClass(1,2,3,4,5,6);


        if( sc instanceof SuperClass){
            System.out.println("YES ,SC is instanceof SuperClass");
        }

        if(sb1 instanceof SuperClass ){
            System.out.println("YES ,SB(subClass) is instanceof SuperClass");
        }else{
            System.out.println("NO, SB(subClass) is Not instanceof SuperClass");
        }


    }
}
