package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //1. Create a scanner object

        //dataType varName = value;

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your name:");

        fName = inputReader.next();// John

        System.out.println("Please enter your last name:");

        System.out.println("Your full name is = " + fName + "");

        lName = inputReader.next();



    }
}
