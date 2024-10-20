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


    }
}