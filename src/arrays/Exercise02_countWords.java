package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {

        /*
        Assume that you are given below String

        String sentence = "I love arrays";

        Count how many words you have in this String

        Expected:
        3

         */
        String sentence = "I love arrays";

        int countS = 0;

        for (int i = 0; i < sentence.length() ; i++) {
            if (sentence.charAt(i) == ' ') countS++;

        }
        System.out.println(countS + 1);

        // or

        int countSS = 0;
        for(char c : sentence.toCharArray()){
            if (c == ' ')countSS++;
        }
        System.out.println(countSS + 1);

        System.out.println("\n---Solution 2 with split() method ----\n");

        String [] arr = sentence.split(" "); // [I, love, arrays]

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length); // 3
    }
}
