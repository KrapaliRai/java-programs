package com.krapali_prac_may;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println("thrid result : " + result);

        result = result / 2;
        System.out.println(result);

        boolean isAliean = false;
        if (isAliean == false) {
            System.out.println("It is not an alien");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("you got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than sec top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these test is true");

        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = true;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (isCar == true) {
            System.out.println("Now this is true");

        }

        double myVal = 20, mySecVal = 80;
        double add = (myVal + mySecVal) * 25;
        double remainder = add % 40;
        System.out.println(add);
        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }

        int score = 5000;

        if(score< 5000 && score > 1000){
            System.out.println("Your scroe is less than 5000 but greater than 1000");
        } else if(score< 1000){
            System.out.println("your score is less than 1000");

        }else {
            System.out.println("Got here");
        }

        //Score calculation:
//
//        boolean gameOver = true;
//        int myscore = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true, 800,8, 100);

        calculateScore(true, 10000, 8,200);

    }
    public static int calculateScore(boolean gameOver, int myscore, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = myscore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
