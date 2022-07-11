package demo.javamain;

import demo.utils.DataUtlis;
import java.util.Scanner;

public class NeutekEntryPoint {

    public static void main(String[] stringArr)
    {
//        testingMainArguments(stringArr);
//        testingScannerFunctionality();


        dataExample();

    }

    private static void dataExample() {

        String nonStaticDateString = DataUtlis.getNonStaticDateString();
        String staticDateString = DataUtlis.getStaticDateString();

//         DataUtlis du= new DataUtlis();
//        String nonStaticDateStringFromANonStaticMethod = du.getNonStaticDateStringFromANonStaticMethod();



        System.out.println("nonStaticDateString : " + nonStaticDateString);
        System.out.println("staticDateString : " + staticDateString);
//        System.out.println("nonStaticDateStringFromANonStaticMethod : " + nonStaticDateStringFromANonStaticMethod);


    }

    private static void testingScannerFunctionality() {
        System.out.println("Requesting User input :");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(scanner.next() +" ");
     } while (scanner.hasNext()) {

        }
    }

    private static void testingMainArguments(String[] stringArr) {
        System.out.println("No of arguments :" + stringArr.length);


        System.out.println(" Use case 1 : Printing String Array in a  for loop ");
        for (String elem : stringArr) {
            System.out.println(elem);
        }

        System.out.println(" Use case 2 : Printing String Array by index");
        System.out.println("stringArr[0] = " + stringArr[0]);
        System.out.println("stringArr[1] = " + stringArr[1]);
        System.out.println("stringArr[2] = " + stringArr[2]);
    }
}
