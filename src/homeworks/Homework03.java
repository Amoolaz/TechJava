package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("\n---Task 1---\n");

        int num1, num2;

        System.out.println("Please enter the first number ");
        num1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second number ");
        num2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));

        System.out.println("\n---Task 2---\n");

        int num3, num4, num5, num6, num7;

        System.out.println("Please enter the first number ");
        num3 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second number ");
        num4 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the third number ");
        num5 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the fourth number ");
        num6 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the fifth number ");
        num7 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The Max value is = " + Math.max(Math.max(num3, num4), Math.max(num5, num6)));
        System.out.println("The Min value is = " + Math.min(Math.min(num3, num4), Math.max(num5, num6)));


        System.out.println("\n---Task 3 ---\n");

        int randomNumber50To100 = (int) (Math.random() * (100 - 50 + 1) + 50);

        int random1 = 55, random2 = 67, random3 = 90;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));

        System.out.println("\n---Task 4 ---\n");

        double alexMoney = 125;
        double mikeMoney = 220;
        double loan = 25.5;

        System.out.println("Alex's money: $ " + (alexMoney - loan));
        System.out.println("Mike's money: $ " + (mikeMoney + loan));

        System.out.println("\n---Task 5 ---\n");

        int CostOfBike = 390;
        double dailySavings = 15.60;
        Object costOfBike = 390;
        int days = (int) ((int) costOfBike / dailySavings);

        System.out.println(days);


        System.out.println("\n---Task 6 ---\n");

        String s1 = "5", s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + i1 * i2);
        System.out.println("Division of 5 and 10 is = " + i1 / i2);
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));

        System.out.println("\n---Task 7 ---\n");

        String s3 = "200", s4 = "-50";

        int i3 = Integer.parseInt(s3);
        int i4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(i3, i4));
        System.out.println("The smallest value is = " + Math.min(i3, i4));
        System.out.println("The average is = " + (i3 + i4 / 2));
        System.out.println("The absolute difference is = " + (i3 - i4));

        System.out.println("\n---Task 8 ---\n");

        double savingDaily = .96;
        int daysToSave1 = (int) ((int) 24 / savingDaily);
        int daysToSave2 = (int) ((int) 168 / savingDaily);

        System.out.println(daysToSave1 + " days");
        System.out.println(daysToSave2 + " days");
        System.out.println("$" + 150 * savingDaily);

        System.out.println("\n---Task 9 ---\n");

        int costOfnewComputer = 1250;
        double savingsAday = 62.5;
        int days1 = (int) ((int) costOfnewComputer / savingsAday);

        System.out.println(days1);

        System.out.println("\n---Task 10 ---\n");

        int costOfnewCar = 14265;
        double option1 = 475.50;
        double option2 = 951;

        int days2 = (int) ((int) (costOfnewCar / option1));

        int days3 = (int) ((int) (costOfnewCar / option2));

        System.out.println("Option 1 will take = " + days2 + " months ");

        System.out.println("Option 2 will take = " + days3 + " months ");

        System.out.println("\n---Task 11---\n");

        int number1, number2;

        System.out.println(" Hey user please enter the first number ");
        number1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println(" Hey user please enter the second number ");
        number2 = inputReader.nextInt();
        inputReader.nextLine();

        double number1a = number1, number2b = number2;

        System.out.println(number1a / number2b);

        System.out.println("\n---Task 12---\n");

        int randomNumber0to100 = (int) (Math.random() * 100 + 1);
        int randomNumber0to101 = (int) (Math.random() * 100 + 1);
        int randomNumber0to102 = (int) (Math.random() * 100 + 1);


        boolean ifNumberBiggerThan25 = randomNumber0to100 > 25 && randomNumber0to101 > 25 && randomNumber0to102 > 25;

        System.out.println(ifNumberBiggerThan25);

        System.out.println("\n---Task 13---\n");

        System.out.println("Hey User, please enter a number between 1 and 7: ");
        int userInput1 = inputReader.nextInt();

        if (userInput1 == 1) {
            System.out.println("MONDAY");
        } else if (userInput1 == 2) {
            System.out.println("TUESDAY");
        } else if (userInput1 == 3) {
            System.out.println("WEDNESDAY");
        } else if (userInput1 == 4) {
            System.out.println("THURSDAY");
        } else if (userInput1 == 5) {
            System.out.println("FRIDAY");
        } else if (userInput1 == 6) {
            System.out.println("SATURDAY");
        } else if (userInput1 == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Number entered not within scope");
        }
        System.out.println("\n---Task14---\n");

        int exam1, exam2, exam3;

        System.out.println("Tell me your exam results?");
        exam1 = inputReader.nextInt();
        exam2 = inputReader.nextInt();
        exam3 = inputReader.nextInt();
        inputReader.nextLine();

        int average = (exam1 + exam2 + exam3) / 3;

        if (average >= 70) {
            System.out.println("YOU PASSED!");
        } else {
            System.out.println("YOU FAILED!");


            System.out.println("\n---Task15---");

            int number1A, number2a, number3a;

            System.out.println("Enter 3 numbers");
            number1A = inputReader.nextInt();
            number2a = inputReader.nextInt();
            number3a = inputReader.nextInt();
            inputReader.nextLine();

            if (number1a == number2a && (number2a == number3a)) {
                System.out.println("TRIPLE MATCH");
            } else if (number1a == number2a || number2a == number3a || number1a == number3a) {
                System.out.println("DOUBLE MATCH");
            } else {
                System.out.println("NO MATCH");
            }
        }
    }
}
