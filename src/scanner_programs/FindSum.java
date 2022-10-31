package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        int numb1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1:");
        numb1 = input.nextInt(); // hasNextInt()

        System.out.println("Please enter number 2:");
        num2 = input.nextInt(); // hasNextInt()

        System.out.println("Please enter number 3:");
        num3 = input.nextInt(); // hasNextInt()

        int sum = numb1 + num2 + num3;

        System.out.println("The sum of the numbers you entered is =" + sum);





    }
}
