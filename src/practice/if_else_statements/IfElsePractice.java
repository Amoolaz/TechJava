package practice.if_else_statements;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        int myInt = 45;
        /*
        If the number is between 0-24 print "first quarter"
        If the number is between 25-49 print "first quarter"
        If the number is between 50-74 print "first quarter"
         */


        if(myInt >= 0 && myInt <= 24){
            System.out.println("first quarter");
        } else if(myInt >= 25 && myInt <= 49){
            System.out.println("second quarter");
        } else if (myInt >= 50 && myInt <= 74) {
            System.out.println("third quarter");
        } else{
            System.out.println("Number too big");
        }

        /*
        if the number is between -50/-1 print "negative part"
        if the number is between 0 print "number is zero"
        if the number is between 1/50 print "number is positive part"

         */

        }
    }















