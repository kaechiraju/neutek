package demo.javamain;

import java.util.Scanner;

public class MainMethodScannerExample {

    public static void main(String[] stringArr)
    {

        testingScannerFunctionality();



    }



    private static void testingScannerFunctionality() {
        System.out.println("Requesting User input :");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(scanner.next() +" ");
     } while (scanner.hasNext()) ;
    }


}
