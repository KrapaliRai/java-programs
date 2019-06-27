package com.krapali_prac_may;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.plaf.synth.SynthPopupMenuUI;

public class Main {

    public static void main(String[] args) {
	// write your code here
        class Human{

            String name;
            int age,height;
            String eyecolor;

            public Human(){

            }

            public void speak(){
                System.out.println("Hi my name is " + name);
                System.out.println("I am " + age + " years old.");
                System.out.println("My height is " + height);
                System.out.println("My Eyecolor is " + eyecolor);
            }
            public void walk(){
                System.out.println("Walking");

            }

            public void eating(){
                System.out.println("Eating ... ");
            }

        }

        Human jo = new Human();
        jo.name = "Jo ";
        jo.eyecolor = "Black";
        jo.height = 100;
        jo.age = 10;
        jo.speak();
        jo.eating();

        Zoo z1 = new Zoo();
        z1.callingAnimal();






//        //Working with Strings:
//        String myString = "This is a String.";
//        System.out.println(myString);
//
//        myString = myString +" This is more...";
//        System.out.println(myString);
//
//        myString = myString + "2019 \u00A9";
//        System.out.println(myString);
//
//        String numString = "10.99";
//        numString = numString + "12";
//        System.out.println(numString);
//
//        String lastString = "10";
//        int myInt = 20;
//        double myDoub = 50.78;
//        System.out.println(lastString= lastString+ myInt + myDoub);

    }
}
