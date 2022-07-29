package demo.javamain;

import demo.helper.Day;
//# enum
public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        tellWhichDay(day);
    }
//#Swtich case
    public static void tellWhichDay(Day thisDay) {
        switch (thisDay) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:  case TUESDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }


//# nested-if
        if(thisDay.toString().contains("MONDAY") && thisDay.toString().contains("HOLIDAY") ){
            System.out.println("With if Else : Gr8est Mondays .");
        }else if(thisDay.equals(Day.MONDAY )){
             System.out.println("With if Else : Mondays are bad.");
        }else if (thisDay.equals(Day.FRIDAY)){
            System.out.println("With if Else : Fridays are better.");
        }else if(thisDay.equals(Day.SUNDAY)  || thisDay.equals(Day.SATURDAY )|| thisDay.equals(Day.TUESDAY  )){
            System.out.println("With if Else : Weekends are best.");
        }else{
            System.out.println("With if Else : Midweek days are so-so.");
        }



        String enumToString=  thisDay.toString();


        if(enumToString.equals("NODAY")){
            System.out.println("it DOOMS DAY!!!");
        }else if (enumToString.equals("HOLIDAY")){
            System.out.println("holiday is Ggr8");
        }else if(enumToString.equals("BRITHDAY")){
            System.out.println("brithday is my day");
        }else{
            System.out.println("This Day  is my lucy day");
        }

    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        System.out.println("============");

        tellWhichDay(Day.MONDAY);
        tellWhichDay(Day.WEDNESDAY);
        tellWhichDay(Day.FRIDAY);
        tellWhichDay(Day.SATURDAY);
        tellWhichDay(Day.SUNDAY);

        System.out.println("**************");

        tellWhichDay(Day.MONDAY_HOLIDAY);
        tellWhichDay(Day.NODAY);
        tellWhichDay(Day.HOLIDAY);
        tellWhichDay(Day.BRITHDAY);


    }
}