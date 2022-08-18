package demo.javamain;

public class JavaOperators {

    public static void main(String[] args) {

        System.out.println("*** Types of Operators in Java ***");
        System.out.println("1) Basic Arithmetic Operators");
        System.out.println("2) Assignment Operators");
        System.out.println("3) Auto-increment and Auto-decrement Operators");
        System.out.println("4) Logical Operators");
        System.out.println("5) Comparison (relational) Operators");
        System.out.println("6) Bitwise Operators");
        System.out.println("7) Ternary Operator");

        System.out.println("\n*** 1) Basic Arithmetic Operators ***");
        System.out.println("+ is for addition\n- is for subtraction\n* is for multiplication\n/ is for division\n% is for modulo");
        System.out.println();

        int num1 = 100;
        int num2 = 20;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        System.out.println("\n*** 2) Assignment Operators ***");
        System.out.println("num2 = num1");
        System.out.println("num2 += num1 -----> num2 = num2 + num1");
        System.out.println("num2 -= num1 -----> num2 = num2 - num1");
        System.out.println("num2 *= num1 -----> num2 = num2 * num1");
        System.out.println("num2 /= num1 -----> num2 = num2 / num1");
        System.out.println("num2 %= num1 -----> num2 = num2 % num1");
        System.out.println();

        System.out.println("When num2 = num1, num2=" + (num2 = num1));
        System.out.println("When num2 += num1, num2=" + (num2 += num1));
        System.out.println("When num2 -= num1, num2=" + (num2 -= num1));
        System.out.println("When num2 *= num1, num2=" + (num2 *= num1));
        System.out.println("When num2 /= num1, num2=" + (num2 /= num1));
        System.out.println("When num2 %= num1, num2=" + (num2 %= num1));

        System.out.println("\n*** 3) Auto-increment and Auto-decrement Operators ***");
        System.out.println("num1++ -----> num1 = num1 + 1");
        System.out.println("num1-- -----> num1 = num1 - 1");

        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1++ = " + num1);
        num1--;
        System.out.println("num1-- = " + num1);

        System.out.println("\n*** 4) Logical Operators ***");
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        //
        System.out.println("b1&&b2 --> "+ (b1&&b2));
        System.out.println("b1&&b2 --> "+ (b1&&b2));
        System.out.println("b1&&b3 --> "+ (b1&&b3));
        System.out.println("b1||b3 --> " + (b1||b3));
        System.out.println("!b3 --> " +!b3);




        int num3 = 30;

        // find the largest number
        // using && operator
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        }else{
            System.out.println(num3 + " is the largest number.");
        }


//TODO:   Show Diff in | VS  ||   and & vs &&
        //  with & and ¦ both operands are always evaluated.
        System.out.println(" ======== int num1 = "+num1  +" int num2 = "+num2+" =============   ");
        System.out.println("With & and ¦ both operands are always evaluated");
        System.out.println("(num1 != num2 | (num1-num2 == 0)--> "+  (num1!=num2 | (num1-num2==0)));
        System.out.println("(num1 != num2 & (num1-num2 == 0) --> "+  (num1!=num2 & (num1-num2==0)));
        System.out.println("(num1 == num2 | (num1-num2 != 0) --> "+  (num1==num2 | (num1-num2!=0)));
        System.out.println("(num1 == num2 & (num1-num2 != 0) --> "+  (num1==num2 & (num1-num2!=0)));

        //With && and ¦¦ the second operand is only evaluated when it is necessary.
        System.out.println("With && and ¦¦ the second operand is only evaluated when it is necessary.");

        System.out.println("(num1 != num2 || (num1-num2 == 0)--> "+  (num1!=num2 || (num1-num2==0)));
        System.out.println("(num1 != num2 && (num1-num2 == 0) --> "+  (num1!=num2 && (num1-num2==0)));
        System.out.println("(num1 == num2 || (num1-num2 != 0) --> "+  (num1==num2 || (num1-num2!=0)));
        System.out.println("(num1 == num2 && (num1-num2 != 0) --> "+  (num1==num2 && (num1-num2!=0)));

        System.out.println("******************" );



        System.out.println("\n*** 5) Comparison (Relational) Operators ***");

        int num4 = 20;
        System.out.println(num3 == num4); // # diff "==" and  "equal"
        System.out.println(num3 != num4);
        System.out.println(num3 > num4);
        System.out.println(num3 >= num4);
        System.out.println(num3 < num4);
        System.out.println(num3 <= num4);

        System.out.println("Checking bit operators 1<1 :" + (1<1));
        System.out.println("Checking bit operators 1<=1 :" + (1<=1));
        System.out.println("Checking bit operators 1>1 :" + (1>1));
        System.out.println("Checking bit operators 1>=1 :" + (1>=1));

        System.out.println("\n*** 6) Bitwise Operators ***");
        int num5 = 11; /* 11 = 00001011 */
        int num6 = 22; /* 22 = 00010110 */
        System.out.println("Bitwise operator performs bit by bit processing.");
        System.out.println();
        System.out.println("'num5 & num6' compares corresponding bits of num5 and num6 and generates 1 if both bits are equal, else it returns 0.");
        System.out.println("num5 & num6 = " + (num5 & num6) + "(00000010)");
        System.out.println();
        System.out.println("'num5 | num6' compares corresponding bits of num5 and num6 and generates 1 if either bit is 1, else it returns 0.");
        System.out.println("num5 | num6 = " + (num5 | num6) + "(00011111)");
        System.out.println();
        System.out.println("'num5 ^ num6' compares corresponding bits of num1 and num2 and generates 1 if they are not equal, else it returns 0.");
        System.out.println("num5 ^ num6 = " + (num5 ^ num6) + "(00011101)");
        System.out.println();
        System.out.println("~num5 is a complement operator that just changes the bit from 0 to 1 and 1 to 0.");
        System.out.println("~num5 = " + (~num5) + "(11110100)");
        System.out.println();
        System.out.println("num5 << 2 is left shift operator that moves the bits to the left, discards the far left bit, and assigns the rightmost bit a value of 0.");
        System.out.println("num5 << 2 = " + (num5 << 2) + "(00101100)");
        System.out.println("In the example above we used 2 at the right side of the shift operator.");
        System.out.println("That is the reason, bits are moving two places to the left side. We can change this number and bits would move accordingly.");
        System.out.println();
        System.out.println("num5 >> 2 is right shift operator that moves the bits to the right, discards the far right bit, and assigns the leftmost bit a value of 0.");
        System.out.println("num5 >> 2 = " + (num5 >> 2) + "(00000010)");
        System.out.println("In the example above we used 2 at the right side of the shift operator.");
        System.out.println("That is the reason, bits are moving two places to the right side. We can change this number and bits would move accordingly.");

        System.out.println("\n*** 7) Ternary Operator ***");
        System.out.println("Ternary operator evaluates a boolean expression and assign the value based on the result.");
        int num7, num8;
        num7 = 1000;
        num8 = (num7 == 1000) ? 2000 : 0; // variable = (expression) ? value1 : value2
        System.out.println("num8 = " + num8);

        System.out.println("\n*** Operator Precedence ***");
        System.out.println("Refer: http://cs-fundamentals.com/java-programming/java-operators-precedence-and-associativity.php");

    } //End of main method

} //End of class JavaOperators