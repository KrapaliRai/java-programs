package com.Arambh;

public class Operators {

    public static void main(String[] args){
        int result = 1+2;
        System.out.println("1+2 = "+ result);

        int previousResult= result;

        result = result- 1;
        System.out.println(previousResult + "-1 = " +result);

        previousResult = result;

        result= result * 20;
        System.out.println(previousResult + "*10 = " + result);

        previousResult = result;

        result= result/ 6;
        System.out.println(previousResult + "/10 = " + result);

        previousResult = result;
        result = result % 4;
        System.out.println(previousResult + "%4 = " +result);

        //Above operator (%) provides the remainder .

        previousResult = result;
        result = result + 5; //value of result got appended with 5
        System.out.println("Result = "+ result);
        result++; // value got appended by one
        System.out.println("Result = "+ result);
        result--; // decrement of value by 1
        System.out.println("Result = "+ result);
        result += 2;
        System.out.println("Result = " + result);
        result -= 2;
        System.out.println("Result = "+ result);
        result /= 2;
        System.out.println("Result = "+ result);

        boolean isAliean = true;
        if (isAliean == true)
            System.out.println("It's not an alien!!");

        // (==) checks if RHS is qual to LHS

        int topScore = 80;
        if (topScore < 100)
            System.out.println("High score");

        int secondTopScore = 60;
        if (topScore> secondTopScore && topScore< 100)
            System.out.println("Yes it is less than top score and less than hundred as well. :)");
            //AND operator

        if ((topScore<90)|| (secondTopScore> 50))
            System.out.println("New Score");
            //OR Operator





    }
}
