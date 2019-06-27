package com.krapali_prac_may;

public class Animal extends Zoo {


    String eatinghabit;
    int count;
    boolean male_gender = false;

    public Animal(){

    }

    public Animal(String species, String name, String eatinghabit, int count, boolean male_gender) {
        this.species = species;
        this.name = name;
        this.eatinghabit = eatinghabit;
        this.count = count;
        this.male_gender = male_gender;
    }

    public void eat(){
        System.out.println("The animal is : " + species);
        System.out.println("It's name is : " + name);
        System.out.println("It eats : " + eatinghabit);
        System.out.println("The number of " + species + " in the zoo is : " + count);
        if(male_gender = true){
            System.out.println("It's  a boy...");
        }
        else{
            System.out.println("It's a girl...");
        }

    }
}
