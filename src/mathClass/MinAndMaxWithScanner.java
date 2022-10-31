package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {

        /*
        Get 2 numbers from user and find their max and min then print them with messages

        Output:
        "Hey user give me a number"
        -> input = 10
        "Hey user give another me a number"
        -> input = 15

        Max of your numbers is 15
        Min of your numbers is 10

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey user give me a number");
        int num1 = scanner.nextInt();

        System.out.println("Hey user give me another number");
        int num2 = scanner.nextInt();

        System.out.println("Your first number is = " + num1);
        System.out.println("Your second number is = " + num2);

        System.out.println("Max of your number is" + Math.max(num1, num2));
        System.out.println("Min of your number is" + Math.min(num1, num2));

        /*

        Get 3 numbers from user and find their max and min then print them with messages

        Output:
        "Hey user give me a number"
        -> input = 10
        "Hey user give me another number"
        -> input = 15
        "Hey user give me the last number"
        -> input = 20

        Max of your numbers is 20
        Min of your numbers is 10
        */

        System.out.println("Hey user give me a number");
        int num4 = scanner.nextInt();

        System.out.println("Hey user give me another number");
        int num5 = scanner.nextInt();

        System.out.println("Hey user give me the last number");
        int num6 = scanner.nextInt();


        System.out.println("Max of your number is" + Math.max((Math.max(num4, num5)), num6));
        System.out.println("Min of your number is" + Math.min((Math.max(num4, num5)), num6));





    }
}