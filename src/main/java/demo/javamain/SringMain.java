package demo.javamain;

import java.util.Locale;

public class SringMain {

    public static void main ( String[] str ){
        String s1= "a";
        String s2 = "A";
        String s3 = "y";
        String s4= new String("a");






        StringBuffer sb= new StringBuffer();
        sb.append("a");
        System.out.println("Before s1: " +s1 +" s2: "+ s2 +" s3: "+s3 +" sb: "+ sb.toString() );

        s3=s3.replace("y", "a");
        s2 = s2.toLowerCase(Locale.ROOT);
        System.out.println("s3 = s3.replace('y', 'a'); "  +" \ns2 = s2.toLowerCase(Locale.ROOT)");
        System.out.println("After  s1: " +s1 +" s2: "+ s2 +" s3: "+s3 +" sb: "+ sb.toString() );
        System.out.println(
                " s1.equals('a') " + s1.equals("a") +
                        "\n'a'.equals(s1) " + "a".equals(s1) +
                        "\n s1.equals(s2) "+s1.equals(s2) +
                        "\n s3.equals(s1) " + s3.equals(s1) +
                        "\n s2.equals(s3) " +s2.equals(s3) +
                        "\n s1.equals(sb) "+ s1.equals(sb.toString()));


        System.out.println("s1 == s4 " +(s1 == s4));
        System.out.println("s1 == s2 " +(s1 == s2));
        System.out.println("s1.hashCode " +s1.hashCode() + " s4.hashCode " +s4.hashCode() );

        System.out.println("s1.equals(s4) "  + s1.equals(s4));
        System.out.println("s1.equals(s4) "  + s1.equals(s4));


        String s5= "kiran";
        String s6= new String("kiran");
        String s7="kiran";
        String s8= new String("kiran");
        StringBuffer sb1= new StringBuffer();
         sb1.append("kiran");


        System.out.println("Example 2:   s5: " +s5 +" s6: "+ s6 + " s7 : "+ s7 +" s8"+ s8  + "sb1" +sb1.toString());
        System.out.println("s5 == s7 " +(s5 == s7));
        System.out.println("s6 == s8 " +(s6 == s8 ));
        System.out.println("s5 == s8 " +(s5 == s8 ));
        System.out.println("s6 == s7 " +(s6 == s7  ));
        System.out.println("s5 == s6 " +(s5 == s6 ));
        System.out.println("s7 == s8 " +(s7 == s8   ));
        System.out.println("s5.hashCode " +s5.hashCode() + "\ns6.hashCode " +s6.hashCode() + "\ns7.hashCode " +s7.hashCode() + "\ns8.hashCode " +s8.hashCode() );
        System.out.println("s5.identityHashCode --> String s5= \"kiran\" " +System.identityHashCode(s5) + "\ns6.identityHashCode --> String s6= new String(\"kiran\") " +System.identityHashCode(s6) + "\ns7.identityHashCode --> String s7= \"kiran\" " +System.identityHashCode(s7) + "\ns8.identityHashCode --> String s8= new String(\"kiran\") " +System.identityHashCode(s8) + "\ns8.identityHashCode --> String sb1= new StringBuffer();sb1.append(\"kiran\"); " +System.identityHashCode(sb1));
        System.out.println(
                " s5.equals('kiran') " + s5.equals("kiran") +
                        "\n'kiran'.equals(s5) " + "kiran".equals("kiran") +
                        "\n s5.equals(s6) "+s5.equals(s6) +
                        "\n s7.equals(s8) " + s7.equals(s8)  +
                        "\n s5.equals(s7) " +s5.equals(s7)  +
                        "\n s6.equals(s8) "+ s6.equals(s8) );




    }
}
