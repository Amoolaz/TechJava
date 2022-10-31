package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        /*
        Write a program that asks users to enter a number if number is more than zero, print "Positive"
        if number is less than zero, print "Negative" Otherwise, print "Zero"
         */

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a number? ");
        int num = inputReader.nextInt();

        if(num > 0){

            System.out.println("\"Positive\"");}

            else if (num < 0) {
            System.out.println("\"Negative\"");}

            else {
            System.out.println("\"Zero\"");
        }}}


//me and olena did this together//

