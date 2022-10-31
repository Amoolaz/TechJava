package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("\n---Task 1--\n");

        int num1, num2, num3;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter number 1: ");
        num1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter number 2: ");
        num2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter number 3: ");
        num3 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The product of the numbers entered is = " + num1 * num2 * num3);

        System.out.println("\n---Task 2---\n");

        String firstName;
        String lastName;
        int yearOfBirth;
        int currentYear;

        System.out.println("Please enter your first name: ");
        firstName = inputReader.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = inputReader.nextLine();

        System.out.println("Please enter your year of birth: ");
        yearOfBirth= inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the current year: ");
        currentYear = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println(firstName + "" + lastName + "'s age is = " + (currentYear - yearOfBirth) + ".");


        System.out.println("\n---Task 3 ---\n");

        String fullName;
        double weight;

        System.out.println("Please enter your full name: ");
        fullName = inputReader.nextLine();

        System.out.println("Please enter your weight as kg: ");
        weight = inputReader.nextDouble();
        inputReader.nextLine();

        System.out.println(fullName + "'s weight is = " + weight * 2.205 + " lbs.");

        System.out.println("\n---Task 4---\n");

        String fullNameStudent1, fullNameStudent2, fullNameStudent3;
        int age1, age2, age3;

        System.out.println("Please enter the first students name: ");
        fullNameStudent1 = inputReader.nextLine();

        System.out.println("Please enter the first students age: ");
        age1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the second students name: ");
        fullNameStudent2 = inputReader.nextLine();

        System.out.println("Please enter the second students age: ");
        age2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter the third students name: ");
        fullNameStudent3 = inputReader.nextLine();

        System.out.println("Please enter the third students age: ");
        age3 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println(fullNameStudent1 + "s age is " + age1 + ".");

        System.out.println(fullNameStudent2 + "s age is" + age2 + ".");

        System.out.println(fullNameStudent3 + "s age is" + age3 + ".");

        System.out.println("The average age is " + (age1 + age2 + age3) /3 + ".");

        System.out.println("The eldest age is " + Math.max(Math.max(age1, age2), age3) + ".");

        System.out.println("The youngest age is " + Math.min((Math.min(age1, age2)), age3) + ".");
    }
}
