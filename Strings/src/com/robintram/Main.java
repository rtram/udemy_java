package com.robintram;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myStrng is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myStrng is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value " + lastString);
    }
}
