package com.Arambh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteNumber = 50;
        short myShortNumber = 100;
        int myIntNumber = 20;
        long myLongNumber = 50000L + 10L*( myByteNumber + myIntNumber + myShortNumber);
        short shortTotal = (short)(1000 + 10*(myByteNumber + myIntNumber +myShortNumber));
        System.out.println(shortTotal);

        int myMinValue= -2147483648; // integer min value
        int myMaxValue= 2147483647; //width of 32

        byte myByteValue = -128; //width of 8
        byte myNewByteValue = (byte)(myByteValue/2);
        /* Type casting has been performed here to
        convert that value to Byte otherwise
        we are going to have incompatible data type
        error. As by default java will treat above value as integer.
         */

        short myShortValue= 32767; // width of 16

        long myLongValue = -9_223_372_036_854_775_807L;
        //Long has width of 64



    }



}
