package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

                    System.out.println("\n---Task 1 ---\n");
                    /*
            TASK-1 characters
            Create a char array and store values below
            #
            $
            5
            A
            b
            H

            Print the array

            EXPECTED:
            [#, $, 5, A, b, }

                     */
        char [] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));


        System.out.println("\n---Task 2 ---\n");

                /*
        TASK-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
         */

        System.out.println("The size of the array = " + characters.length);

        System.out.println("\n---Task 3 ---\n");

                    /*
            TASK-3
            Print each element using fori loop

            EXPECTED:
            #
            $
            5
            A
            b
            H
                */
        for (int i = 0; i < characters.length ; i++) {
            System.out.println(characters[i]);



        }

        System.out.println("\n---Task 4 ---\n");
/*
         /*
            TASK-4
            Print each element using for-each loop    ////need help understanding this

            EXPECTED:
            #
            $
            5
            A
            b
            H
                */
        for (char element : characters){
        System.out.println(element);

    }

        System.out.println("\n---Task 5 for each loop ---\n");

                        /*
                TASK-5
                Print each element that are letters

                EXPECTED:
                A
                b
                H
                 */

       for(char character : characters){
           if(Character.isLetter(character)) System.out.println(character);
       }
        System.out.println("\n---Task 5 fori loop ---\n");

        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i])) System.out.println(characters[i]);

        }

        System.out.println("\n---Task 6 for each loop ---\n");

        /* Task -6
        Count how many uppercase characters you have in the array

        Expected:
        2
         */
        System.out.println("\n----------TASK-6 - for each loop-----------\n");

        int countU1 = 0;

        for (char character : characters) {
            if(Character.isUpperCase(character)) countU1++;
        }

        System.out.println(countU1);


        System.out.println("\n----------TASK-6 - fori loop-----------\n");

        int countU2 = 0;

        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i])) countU2++;
        }

        System.out.println(countU2);

        /*
        Additional Tasks
        Count lowercase, specials, digits, and space
         */


    }}
