package com.krapali_prac_may;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myMinVal = -2_147_483_648;
        int myMaxVal = 2_147_483_647;
        int mytotal = (myMinVal/2);
        System.out.println(mytotal);

        byte myMinByteVal = -128;
        byte myMaxByteVal = 127;
        byte myNewByteVal =  (byte) (myMinByteVal/2);
        System.out.println(myNewByteVal);

        short myMinShortVal = -32768;
        short myMaxShortVal = 32767;

        byte newByteVar = 10;
        short newShortVar = 20;
        int newIntVar = 50;
        long newLongVar = (50000+ 10*(newByteVar+newShortVar+newIntVar));
        System.out.println("newLongVAr:  " + newLongVar);

        //Working with float and Double data types
        int myNewIntVal = 5/2;
        float myFloatVal = 22f/ 7;
        double myDOubleVal = 22d/ 7d;
        //Double is precise , faster and inbuilt in java, so it is reccommended
        System.out.println(" myInt val : "+ myNewIntVal + " Float : " + myFloatVal + " Double  : " + myDOubleVal);



        //Convert a given number of pound to Kg
        double quantPound=200, quantKg=0, result=0;

        quantKg = (0.45359237* quantPound);

        System.out.println(quantKg);

        //Working with characters:

        char myChar = '\u0943';
        String myString = "\u0958\u0943\u092A\u093E\u0932\u0940";
        System.out.println(myChar);
        System.out.println(myString);

        char myUNIchar = '\u00AE';
        System.out.println(myUNIchar);

        //Working with booleans
        boolean isMale = false;
        System.out.println(isMale);


        //Working with the String data type:
        //Primitive data types till now
        //int, byte, short, long, double, float, char, boolean, total 8 primitive types

        //Now String in next project String


    }
}
