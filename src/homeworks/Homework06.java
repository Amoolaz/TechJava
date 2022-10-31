package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n ---Task 1---\n");
        /*
                        Requirement:
                -Create an int array having size of 10
                -Assign 23 to index of 2
                -Assign 12 to index of 4
                -Assign 34 to index of 7
                -Assign 7 to index of 9
                -Assign 15 to index of 6
                -Assign 89 to index of 0
                THEN:
                -Print element at index of 3
                -Print element at index of 0
                -Print element at index of 9
                -Print the entire array
                Expected Result:
                0
                89
                7
                [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
                         */
        int[] numbers1 = new int[10];
        numbers1[2] = 23;
        numbers1[4] = 12;
        numbers1[7] = 34;
        numbers1[9] = 7;
        numbers1[6] = 15;
        numbers1[0] = 89;

        System.out.println(numbers1[3]);
        System.out.println(numbers1[0]);
        System.out.println(numbers1[9]);

        System.out.println(Arrays.toString(numbers1));


        System.out.println("\n---Task 2 ---\n");

        /*
            Task-2
            Requirement:
            -Create a String array having size of 5
            -Assign “abc” to index of 1
            -Assign “xyz” to index of 4
            THEN:
            -Print element at index of 3
            -Print element at index of 0
            -Print element at index of 4
            -Print the entire array
            Expected Result:
            null
            null
            xyz
            [null, abc, null, null, xyz]
         */

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";

        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));


        System.out.println("\n---Task 3 ---\n");
        /*
        Requirement:
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]

         */

        int[] numbers = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        System.out.println("\n---Task 4 ---\n");
        /*
               Requirement:
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania
        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically
        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine]

         */
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n---Task 5 ---\n");
                /*
                Requirement:
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
        THEN:
        -Print the entire array
        -Then, check if it contains Pluto
        if it contains Pluto, then print true
        if it does not contain Pluto, print false
        Expected Result:
        [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
         */
        String[] cartoons = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoons));

        boolean hasPluto = false;
        for (String object : cartoons) {
             if(object.equals("Pluto")){
                 hasPluto = true;
                 break;
             }

        }
        System.out.println(hasPluto);

        System.out.println("\n--- Task 6 ---\n");
        /*
        Requirement:
        -Create a String array that stores cartoon cats
                below
        Garfield, Tom, Sylvester, Azrael
        THEN:
        -Print the entire array sorted lexicographically
                -Then, check if it contains Garfield and Felix
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false

         */
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean hasGarfield = false;
        boolean hasFelix = false;

        for(String object : cartoonCats){
            if(object.equals("Garfield")){
                hasGarfield = true;
                if(object.equals("Felix")){
                    hasFelix = true;
                }
                break;
            }
            System.out.println(hasGarfield && hasFelix);
        }


        System.out.println("\n---Task 7 ---\n");

        /*
                Requirement:
        -Create a double array that stores numbers below
        10.5, 20.75, 70, 80, 15.75
        THEN:
        -Print the entire array
        -Print each element
        Expected Result:
        [10.5, 20.75, 70, 80, 15.75]
        10.5
        20.75
        70.0
        80.0
        15.75

         */

        double[] decimals = {10.5, 20.75, 70.0, 80.0, 15.75};
        System.out.println(Arrays.toString(decimals));

        for (double elements : decimals) {
            System.out.println(elements);

        }


        System.out.println("\n---Task 8 ---\n");
        /*
                    Requirement:
            -Create a char array that stores characters below
            A, b, G, H, 7, 5, &, *, e, @, 4
            THEN:
            -Print the entire array
            -Print the total count of the letters
            -Print the total count of lowercase letters
            -Print the total count of uppercase letters
            -Print the total count of digits
            -Print the total count of special characters
            Expected Result:
            [A, b, G, H, 7, 5, &, *, e, @, 4]
            Letters = 5
            Uppercase letters = 3
            Lowercase letters = 2
            Digits = 3
            Special characters = 3

         */
        
        char [] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@','4'};

        int lettersz = 0, upper = 0, lower = 0, digits = 0,special = 0;

        System.out.println(Arrays.toString(characters));

        for (Character character : characters) {
            if (Character.isLetter(character)){
                lettersz++;
                if (Character.isUpperCase(character)) upper++;
                else if (Character.isLowerCase(character)) lower++;
            }
            else if (Character.isDigit(character)) digits++;
            else special++;
        }
        System.out.println("Letters = " + lettersz +
                "\nUppercase letter = " + upper +
                "\nLowercase letters = " + lower +
                "\nDigits = " + digits +
                "\nSpecials characters = " + special);



        System.out.println("\n---Task 9 ---\n");
                    /*
                    Requirement:
            -Create a String array that stores objects below
            Pen, notebook, Book, paper, bag, pencil, Ruler
            THEN:
            -Print the entire array
            -Print how many elements starts with uppercase
            -Print how many elements starts with lowercase
            -Print how many elements starts with B or P, ignoring cases
            -Print how many elements has “book” or “pen” in it, ignoring
            cases
            Expected Result:
            [Pen, notebook, Book, paper, bag, pencil, Ruler]
            Elements starts with uppercase = 3
            Elements starts with lowercase = 4
            Elements starting with B or P = 5
            Elements having ”book” or “pen”= 4


         */

        String [] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));

        int countOfUppercase = 0;
        int countOfLowercase = 0;
        int countOfBorP = 0;
        int countOfBookOrPen = 0;

        for (String object: objects){
            if (Character.isUpperCase(object.charAt(0))) countOfUppercase++;
            if (Character.isLowerCase(object.charAt(0))) countOfLowercase++;
            if (object.toLowerCase().charAt(0) == 'p' || object.toLowerCase().charAt(0) == 'b') countOfBorP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) countOfBookOrPen++;
        }
        System.out.println("Elements stars with uppercase = " + countOfUppercase +
                "\nElements stars with lowercase = " + countOfLowercase +
                "\nElements stars with B or P = " + countOfBorP+
                "\nElements having \"book\" or \"pen\" = " + countOfBookOrPen);


        System.out.println("\n---Task 10 ---\n");
        /*
                    Requirement:
            -Create an int array that stores numbers below
            3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
            THEN:
            -Print the entire array
            -Print how many elements are more than 10
            -Print how many elements are less than 10
            -Print how many elements are 10
            Expected Result:
            [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
            Elements that are more than 10 = 5
            Elements that are less than 10 = 4
            Elements that are 10 = 2
         */

        int [] around = { 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int greaterThan10 = 0;
        int lessThan10 = 0;
        int areEqualTo10 = 0;

        System.out.println(Arrays.toString(around));

        for (Integer numbers10: around){
            if (numbers10 > 10) greaterThan10++;
            else if (numbers10 < 10) lessThan10++;
            else areEqualTo10++;
        }
        System.out.println("Elements that are more than 10 = " + greaterThan10 +
                "\nElements that are less than 10 = " + lessThan10 +
                "\nElements that are 10 = " + areEqualTo10);


        System.out.println("\n---Task 11 ---\n");
                /*
                Requirement:
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
        THEN:
        -Print both arrays
        –Then, create a new array called that will take
        greatest of same index from first 2 arrays
        -Print third array as well
        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
         */

        int [] firstArray = { 5, 8, 13, 1, 2};
        int [] secondArray = { 9,3, 67, 1, 0};

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        System.out.println("1st array is = " + Arrays.toString(firstArray));
        System.out.println("2nd array is = " + Arrays.toString(secondArray));

        int[] maxNumbers = new int[5];

        maxNumbers[0] = Math.max(firstArray[0], secondArray[0]);
        maxNumbers[1] = Math.max(firstArray[1], secondArray[1]);
        maxNumbers[2] = Math.max(firstArray[2], secondArray[2]);
        maxNumbers[3] = Math.max(firstArray[3], secondArray[3]);
        maxNumbers[4] = Math.max(firstArray[4], secondArray[4]);

        System.out.println(Arrays.toString(maxNumbers));


    }
}
