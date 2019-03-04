package com.robintram;

public class Main {

    public static void main(String[] args) {

        int intValue = 5 / 2;
        float floatValue = 5f / 3f;
        double doubleValue = 5d/ 3d;
        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
//        floatValue = 1.6666666 width of float = 32 (4 bytes)
        System.out.println("doubleValue = " + doubleValue);
//        doubleValue = 1.6666666666666667 width of double = 64 (8 bytes) USE DOUBLES

//        Convert a given number of pounds to kilograms
//        1. Create a variable to store the number of pounds
//        2. Calculate the number of kilograms for the number above and store in a variable.
//        3. Print out the result
//        NOTE: 1 pound is equal to 0.45359237 kilograms

//        1.
        int pounds = 200;

//        2.
        double kilograms = pounds * .453_592_37d;

//        3.
        System.out.println("Kilograms = " + kilograms);
    }
}
