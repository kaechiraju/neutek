package demo.utils;

public class DataUtlis {


    private static String staticMonth ="Mar";
    private static String staticDate="23";
    private static String staticYear="1998";




    private String non_staticMonth ="08";
    private String non_staticDate= "feb";
    private String non_staticYear="1998";


    public DataUtlis() {
        super();

        System.out.println("default constor is called ......");
        staticMonth=  non_staticMonth="26";
        staticDate=  non_staticDate="oct";
        staticYear= non_staticYear="1983";
    }

    public DataUtlis(String non_staticMonth, String non_staticDate, String non_staticYear) {
        super();
        staticMonth = non_staticMonth;
        staticDate = non_staticDate;
        staticYear = non_staticYear;

        this.non_staticMonth=non_staticMonth;
        this.non_staticDate=non_staticDate;
        this.non_staticYear=non_staticYear;

    }


    public static String getStaticDateString() {
        return staticMonth + "-" + staticDate + "-" + staticYear;
    }


    public static String getNonStaticDateString() {
        DataUtlis du= new DataUtlis();
        return du.getNon_staticMonth() + "-" + du.getNon_staticDate() + "-" + du.getNon_staticYear();
    }


    public String getNonStaticDateStringFromANonStaticMethod(){
        return non_staticMonth + "-" + non_staticDate + "-" + non_staticYear;

    }



    public String getNon_staticMonth() {
        return non_staticMonth;
    }

    public void setNon_staticMonth(String non_staticMonth) {
        this.non_staticMonth = non_staticMonth;
    }

    public String getNon_staticDate() {
        return non_staticDate;
    }

    public void setNon_staticDate(String non_staticDate) {
        this.non_staticDate = non_staticDate;
    }

    public String getNon_staticYear() {
        return non_staticYear;
    }

    public void setNon_staticYear(String non_staticYear) {
        this.non_staticYear = non_staticYear;
    }
}
