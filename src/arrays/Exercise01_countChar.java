package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /*
        Assume you are given a String as below

        String word = "Java";

        Count how many a letters you have in the String
         */

        String word = "Java";
        int countA = 0;

        for (int i = 0; i < word.length(); i++) {
          if(  word.charAt(i) == 'a') countA++;

        }
        System.out.println(countA);

       char [] wordArray = word.toCharArray(); // {'J', 'a', 'v', 'a'}

        System.out.println(Arrays.toString(wordArray)); // [J, a, v, a]

        int countAb = 0;

        for(char element : wordArray){
            if(element == 'a') countAb++;


        }
        System.out.println(countAb);


    }
}
