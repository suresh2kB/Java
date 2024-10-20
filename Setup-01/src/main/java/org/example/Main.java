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
    }
}