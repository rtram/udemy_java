package com.robintram;

public class Main {

    public static void main(String[] args) {

        char myChar = '\u00A9';
        System.out.println("Unicode output was:" + myChar);

        boolean isMale = true;
        System.out.println("Am I Male? " + isMale);

//        1. Find the code for the registered symbol on the same line as the copyright symbol.
//        2. Create a variable of type char and assign it the unicode value for that symbol.
//        3. Display in on screen.

//        1 && 2.
        char registered = '\u00AE';

//        3.
        System.out.println("Registered Symbol " + registered);
    }
}
