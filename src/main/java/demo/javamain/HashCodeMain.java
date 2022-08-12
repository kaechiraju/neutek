package demo.javamain;

import demo.helper.Identity;

public class HashCodeMain {

    public static void main(String[] str) {

        boolean hasError = false;
        Identity id1 = new Identity("10/26/1983", "aechiraju", "kiran", "280-090-3000");
        Identity id2 = new Identity("10/26/1988", "aechiraju", "teja", "280-090-5000");
        Identity id3 = new Identity("10/22/2017", "aechiraju", "mouktika", "580-090-5000");
        Identity id4 = new Identity("10/26/1983", "aechiraju", "kiran", "280-090-3000");
        Identity id5=null;
        try {
              id5 = id2.clone();
        } catch (CloneNotSupportedException e) {
            hasError = true;
            e.printStackTrace();
        } catch (Exception ex) {
            hasError = true;
            ex.printStackTrace();
        }
        Identity id6 = new Identity();

//        Identity id7 = null;
        System.out.println(
                " Identity id1 = new Identity(\"10/26/1983\", \"aechiraju\", \"kiran\", \"280-090-3000\");           " + "id1.hashCode  :" + id1.hashCode() + "  Address on memory  (id1) :" +System.identityHashCode(id1)+"\n"+
                " Identity id2 = new Identity(\"10/26/1988\", \"aechiraju\", \"teja\", \"280-090-5000\");            " + "id2.hashCode  :" + id2.hashCode() + "  Address on memory  (id2) :" +System.identityHashCode(id2)+"\n"+
                " Identity id3 = new Identity(\"10/22/2017\", \"aechiraju\", \"mouktika\", \"580-090-5000\");        " + "id3.hashCode  :" + id3.hashCode() + "  Address on memory  (id3)  :" +System.identityHashCode(id3)+"\n"+
                " Identity id4 = new Identity(\"10/26/1983\", \"aechiraju\", \"kiran\", \"280-090-3000\");           " + "id4.hashCode  :" + id4.hashCode() + "   Address on memory  (id4)  :" +System.identityHashCode(id4)+"\n"+
                " Identity id5 = id2.clone();                                                                " + "id5.hashCode :" + id5.hashCode() +" Address on memory  (id5) :" +System.identityHashCode(id5)+"\n"+
                " Identity id6 = new Identity();                                                             " + "id6.hashCode :" + id6.hashCode() +" Address on memory  (id6) :" +System.identityHashCode(id6)+"\n");

        // When call overriden equal method
        System.out.println("id1.equals(id4) " +id1.equals(id4));
        System.out.println("id5.equals(id2) " +id5.equals(id2));

       // When call equal from Object.java
        System.out.println("id1.superEqual(id4) " +id1.superEqual(id4));
        System.out.println("id5.superEqual(id2) " +id5.superEqual(id2));

    }
}
