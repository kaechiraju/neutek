package demo.javamain;

import java.util.Scanner;

public class MainMethodStringArgument {

    public static void main(String[] stringArr)
    {
        testingMainArguments(stringArr);




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
