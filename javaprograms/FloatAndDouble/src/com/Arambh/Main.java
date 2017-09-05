package com.Arambh;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int myIntValue1 = 5;

    float myFloatValue1=(float)5.4;
    // here type casting is done by using keyword "float" before the number.

    float myNewFloatValue1=5f;
    // Type casting is done by using putting an f at the end.
// proper practice is put f after the number

    double myDoubleValue1= 5d;
System.out.println("myIntValue ="+ myIntValue1);
System.out.println("MyFloatValue=" + myFloatValue1);
        System.out.println("MyNewFloatValue=" + myNewFloatValue1);
System.out.println("MyDoubleValue=" + myDoubleValue1);

        int myIntValue = 5/3;
        float myFloatValue=(float)5/3;
        float myNewFloatValue=5f/3f;
        double myDoubleValue= 5d/3d;

        System.out.println("myIntValue ="+ myIntValue);
        System.out.println("MyFloatValue=" + myFloatValue);
        System.out.println("MyNewFloatValue=" + myNewFloatValue);
        System.out.println("MyDoubleValue=" + myDoubleValue);


        // Conversion Assignment from pounds to kilogram.

        float numberOfPounds;
        numberOfPounds = 10;

        double numberOfKilograms = numberOfPounds/0.45359237;

        System.out.println("\n\nNumber of Kilograms=" + numberOfKilograms);

    }
}
