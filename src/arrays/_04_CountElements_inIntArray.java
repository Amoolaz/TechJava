package arrays;

public class _04_CountElements_inIntArray {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        You can count
        Negatives: 2
        Positives: 5
        Neutral or zero: 3

        even: 6
        odd: 4

        max: 10
        nim: -7

        sum of the numbers: 28
        average of the numbers: 2
        how many unique numbers: 7
        how many of those numbers are represented in fibonacci sequences: 6
        prime numbers: 2
        how many numbers can be divided by 5: 6
        absolute difference between the max and min of these numbers: 17
        closest number to (take the left if there's two) 9: 8

         */

        int negatives = 0;

        for (int number : numbers){
            if(number < 0) negatives ++;

        }
        System.out.println("Negative count is = " + negatives);

        int positive = 0;

        for(int number : numbers){
            if (number > 0) positive++;
        }
        System.out.println("Positive count is = " + positive);

        /*
        Count how many even numbers you have

        Expected:
        6

       {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

         */


        int even1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) even1 ++;

            }
        System.out.println(even1);

        int even2 = 0;

        for(int number : numbers){
            if (number % 2 == 0) even2 ++;
        }
        System.out.println(even2);

        }

    }

