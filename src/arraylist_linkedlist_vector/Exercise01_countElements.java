package arraylist_linkedlist_vector;

import javax.swing.*;
import java.util.ArrayList;

public class Exercise01_countElements {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple

        Print the ArrayList
        Print the size
        Print each element separately

        Expected:
        [Blue, Brown, Pink, Yellow, Red, Purple]

        6

        Blue
        Brown
        Pink
        Yellow
        Red
        Purple

         */

        System.out.println("\n------Task-1------\n");

        ///ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Brown","Pink","Yellow", "Red", "Purple"));


        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\n----Task 2---\n");
          /*
    Count the elements that has a length of 6

    Expected:
    2
     */
        System.out.println("\n------Task 2------\n");

        int counter1 = 0;

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() == 6) counter1++;
        }
        System.out.println(counter1);


        System.out.println("\n---- for each loop-----\n");
        int count6 = 0;

        for (String color : colors) {
            if(color.length() == 6) count6++;
        }
        System.out.println(count6);//2

        System.out.println("\n---Task 3 Elements that has 'o --\n");
        /*
        Count the elements that has 'o'
        // Brown and yellow
        Expected:
        2
         */


        System.out.println("\n------TASK-3 - Elements that has 'o'-------\n");

        int countO = 0;

        for (String color : colors) {
            if(color.toLowerCase().contains("o")) countO++;
        }

        System.out.println(countO);

        countO = 0;

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).toLowerCase().contains("o")) countO++;
        }

        System.out.println(countO);


    }
}

















