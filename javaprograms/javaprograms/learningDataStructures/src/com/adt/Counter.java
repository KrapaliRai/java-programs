package com.adt;

public class Counter {

    int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public void increment(){
        counter = counter +1;
        System.out.println("Incremented to : " + counter );
    }

    public int getCurrentValue(){
        System.out.println(" The current value : " + counter);
        return counter;

    }

    public String toString(int i){
        System.out.println(toString(counter));
        return String.valueOf(counter);
    }



//    public static void main(String[] args) {
//        Counter c1 = new Counter(785);
//        c1.increment();
//        c1.getCurrentValue();
//        c1.toString();
//
//
//    }
}
