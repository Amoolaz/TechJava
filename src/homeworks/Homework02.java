package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("\n---Task1---\n");

        int num1,num2;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter number 1: ");
        num1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter number 2: ");
        num2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));

        System.out.println("\n---Task2---\n");

        int num3, num4;

        System.out.println("Please enter the first number: ");
        num3 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second number: ");
        num4 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The product of the given two numbers is = " + num3 * num4);

        System.out.println("\n---Task3---\n");

        double num5, num6;

        System.out.println("Please enter number the first number: ");
        num5 = inputReader.nextDouble();
        inputReader.nextLine();

        System.out.println("Please enter number the second number: ");
        num6 = inputReader. nextDouble();
        inputReader.nextLine();

        System.out.println("The sum of the given number is: " + (num5 + num6));

        System.out.println("The product of the given numbers is: " + num5 * num6);

        System.out.println("The subtraction of the given numbers is: " +(num5 - num6));

        System.out.println("The division of the given numbers is: " + num5 / num6);

        System.out.println("The remainder of the given numbers is: " + num5 % num6);

        System.out.println("\n---Task4---\n");

        System.out.println("1.\t\t" + (-10 +  (+ 7 * 5)));
        System.out.println("2.\t\t" + (72+24) % 24);
        System.out.println("3.\t\t" + (10 + (-3 * 9) / 9));
        System.out.println("4.\t\t" + (5 + (18 / 3) * 3 - (6 % 3)));

        System.out.println("\n---Task5---\n");

        int num7, num8;

        System.out.println("Please enter the first number: ");
        num7 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second number: ");
        num8 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The average of the given numbers is: " + (num7 + num8) / 2);

        System.out.println("\n---Task6---\n");

        int num9, num10, num11, num12, num13;

        System.out.println("Please enter the first number: ");
        num9 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second number: ");
        num10 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the third number: ");
        num11 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the fourth number: ");
        num12 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the fifth number: ");
        num13 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The average of the given numbers is: " + (num9 + num10 +num11 + num12 +num13) / 5);

        System.out.println("\n---Task 7---\n");

        int num14, num15, num16;

        System.out.println("Please enter the first number: ");
        num14 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second number: ");
        num15 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the third number: ");
        num16 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The 5 multiplied with 5 is = 25 ");

        System.out.println(" The 6 multiplied with 6 is = 36 ");

        System.out.println("The 10 multiplied with 10 is = 100 ");

        System.out.println("\n---Task 8---\n");

        int num17;

        System.out.println("Please enter the side of the square: ");
        num17 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Perimeter of the square = " + 4 * num17);

        System.out.println("Area of the square = " + num17 * num17);

        System.out.println("\n---Task 9 ---\n");

        double yearlySalary = 90_000;

        System.out.println("A Software Engineer in Test can earn $" + yearlySalary * 3 + " in 3 years.");

        System.out.println("\n---Task10---\n");

        String favBook;
        String favColor;
        int favNumber;

        System.out.println("Please enter your favorite book: ");
        favBook = inputReader.nextLine();

        System.out.println("Please enter your favorite color: ");
        favColor = inputReader.nextLine();

        System.out.println("Please enter your favorite number: ");
        favNumber = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);

        System.out.println("\n---Task 11---\n");

        String firstName, lastName, emailAddress, phoneNumber, address;
        int age;

        System.out.println("Please enter your first name: ");
        firstName = inputReader.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = inputReader.nextLine();

        System.out.println("Please enter your age: ");
        age = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your email address: ");
        emailAddress = inputReader.nextLine();

        System.out.println("Please enter your phone number: ");
        phoneNumber = inputReader.nextLine();

        System.out.println("Please enter your address: ");
        address = inputReader.nextLine();

        System.out.println("\tUser's who joined this program is " + firstName + " " + lastName + "." + " John's age is "
                + "\n" + age + "." + " John's email address is " + emailAddress + "," + " phone number " +
                "\nis " + phoneNumber + "," + " and address is " + address + ".");
    }
}