package org.example;

public class Main {
    public static void main(String[] args) {
//        In java we cannot use single quotes for string, as we use in javascript
        System.out.println("Hello world!, This is my first step in learning java.");

        // int type variable declaration.
        int myFirstNumber = 5;
        System.out.println(myFirstNumber);
        myFirstNumber = 6; // Re-Assign a variable.
        System.out.println(myFirstNumber);

        // Expression declaration.
        int mySecondNumber = (10+5)+(2*10);
        System.out.println(mySecondNumber);
        int myThirdNumber = 6;
        int myFourthNumber = myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(myFourthNumber);

        int myLastOne = 1000-myFourthNumber;
        System.out.println(myLastOne);

        // Primitive data types.
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(intMinValue);
        System.out.println(intMaxValue);

        System.out.println("Range for int is from "+intMinValue + " to "+intMaxValue);
        // For primitive data type to store numbers, we have defined ranges to store number.
        // If we try to store outside of that range. It will give error.
        intMaxValue = intMaxValue+1;
        System.out.println(intMaxValue);

        int numberWithUnderScore = 1_234_457;
        System.out.println(numberWithUnderScore);

        boolean condition = true;
        condition = Boolean.FALSE;
        Boolean conditions = true;

        // number data types
        System.out.println("byte range from "+Byte.MIN_VALUE + " to "+Byte.MAX_VALUE);
        System.out.println("short range from "+Short.MIN_VALUE + " to "+Short.MAX_VALUE);
        System.out.println("int range from "+Integer.MIN_VALUE + " to "+Integer.MAX_VALUE);
        System.out.println("long range from "+Long.MIN_VALUE + " to "+Long.MAX_VALUE);

        byte byteNumber = 12;
        short shortNumber = 13;
        int intNumber = 14;
        long longNumber = 15L;

        System.out.println("A Byte has size of "+Byte.SIZE);
        System.out.println("A Short has size of "+Short.SIZE);
        System.out.println("A Integer has size of "+Integer.SIZE);
        System.out.println("A Long has size of "+Long.SIZE);

        // We must always use, 'L' when trying to assign a value more than Integer.INT_MAX to long variable.

        // Declaring two variables in one line.
        int firstIntNumber = 2;short firstShortNumber = 3;
        int firstIntNumber1 = 2,secondIntNumber = 4;
        int firstIntNumber3 = 2;int secondIntNumber3 = 4;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMinByteValueHalf = (byte) (myMinByteValue/2);
        long myLongValue = (long) (Integer.MIN_VALUE/2);

        byte one = 12;
        short two = 14;
        int third = 15;
        long fourth = (long) (50000L+(10L*(one+two+third)));
        System.out.println("fourth number is : "+fourth);
    }
}