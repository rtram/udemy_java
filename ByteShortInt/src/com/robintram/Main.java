package com.robintram;

public class Main {

    public static void main(String[] args) {

//        int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);

        System.out.println("myTotal = " + myTotal);

//        byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;
        byte myByteTotal = (byte)(maxByte/2);

        System.out.println("myByteTotal = " + myByteTotal);

//        short has a width 16
        short maxShort = 32767;
        short myShortTotal = (short) (maxShort/2);

        System.out.println("myShortTotal = " + myShortTotal);

//        long has a width of 64, make sure to add an 'l' or 'L' after number to distinguish that it is a long number
        long longValue = 100L;


//        1. Create a byte variable and set it to any valid byte number.
//        2. Create a short variable and set it to any valid short number.
//        3. Create a int variable and set it to any valid int number.
//        4. Create a variable of type long, and make it equal to
//          50000 + 10 times the sum of the byte, plus the short plus the int

//        1.
        byte number1 = 10;

//        2.
        short number2 = 20;

//        3.
        int number3 = 50;

//        4.
        long number4 = 50000L + 10L *(number1 + number2 + number3);

        System.out.println("longTotal = " + number4);
    }
}
