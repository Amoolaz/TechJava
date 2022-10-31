package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int [] numbers = {3, 5, 8, 10};

        // Search for 7 and return true if it exists in this array, return false if otherwise -> false

        boolean has7 = false;

        for(int number : numbers){
            if(number == 7) {
                has7 = true;
                break;
            }
        }
        System.out.println(has7); // false

        // Search for 5 and return if it exists in this array, return false if otherwise -> true
        //for each loop
        //3, 5, 8, 10

        boolean has5 = false; // true

        for(int number : numbers){
            if(number == 5){
                has5 = true;
                break;

            }
        }
        System.out.println(has5);

        System.out.println("\n---Binary search in arrays----\n");

        // NOTE: Binary search can be used if the array is sorted ONLY, otherwise you will get the wrong results
        // Binary search returns the index of the element if found
        // 3, 5, 8, 10, 10
        // if the index returned is zero or positive, it means the element exists
        // if the index returned is negative, it means the element doesn't exist
        // if two elements exist, then the method returns the last index

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5)); // 1
        System.out.println(Arrays.binarySearch(numbers, 10)); // 3
        System.out.println(Arrays.binarySearch(numbers, 1)); // - something doesn't exist in the array






    }
}
