package practice.if_else_statements;

import java.util.Scanner;

public class ifElseStatements {
    public static void main(String[] args) {

        /* Write a program that generates a random number between 0 and 50 (both 0 and 50 are
        both included)
        print true if number is between 10 and 25 (10 and 25 included)
        Print false if otherwise
            (int)(randomNumber * (big point - small point + 1) + small point)
            1. Random number generate it
            2. if else, ternary, sout method
         */
        System.out.println("\n---Task1---\n");

        int myRandomNumber = (int)(Math.random() * (51) + 0);
        System.out.println("My random number is = " + myRandomNumber);
        //10 -25(both included)
        if (myRandomNumber >= 10 && myRandomNumber <= 25){
            System.out.println("true");

        } else {
            System.out.println("false");

        }
        //ternary solution
        System.out.println((myRandomNumber >= 10 && myRandomNumber <=25) ?"true" : "false" );

        System.out.println((myRandomNumber >= 10 && myRandomNumber <=25));

        System.out.println("\n---Task2---\n");

        /* write a program that generates a random number between 1 and 100
        (both 1 and 100 are included)
        Find which quarter and half is number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-70
        4th quarter is 76 - 100
        1st half is 51-50
        2nd half is 51-100
        test data  : 34
        expected results :
         34 is in the 1st half
         34 is in the 2nd quarter

         */
        int mySecondRandom = (int)(Math.random() * (100) + 1);// 1-100

        if (mySecondRandom <= 50) {
            System.out.println(mySecondRandom + "is in the 1st half");
            if (mySecondRandom <= 25) {
                System.out.println(mySecondRandom + "is in the 1st quarter");

            } else {
                //51-100
                System.out.println(mySecondRandom + "is in the 2nd half");
                if (mySecondRandom <= 75) {
                    System.out.println(mySecondRandom + "is in the 3rd quarter");
                } else {
                    System.out.println(mySecondRandom + "is in the 4th quarter");
                }
            }


        }

        /*
                        // Scanner//
                        Is it raining (true/false)
                        Do you have umbrella? (true/false)
                        Are you hungry? (true/false)

                        // if else //
                        it is raining -> it is raining outside
                            if you have umbrella -> you can go outside
                            otherwise -> you stay home

                        it is not raining -> it is not raining outside
                            if you are hungry -> you go to chick-fil-a
                            otherwise -> you are riding a bike
         */

        System.out.println("\n---Task3---\n");

        Scanner questionAsker = new Scanner(System.in);

        boolean rainingToday = true;
        boolean havingUmbrella = false;
        boolean areUhungry= true;



    }
}

