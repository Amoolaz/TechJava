package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("\n---Task 1---\n");

        String name = ScannerHelper.getAName();

        System.out.println("The length of the name is = " + name.length());

        System.out.println("The first character in the name is = " + name.charAt(0));

        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));

        System.out.println("The first three characters in the name is = " + name.substring(0, 3));

        System.out.println("The last three characters in the name is = " + name.substring((name.length() - 3)));

        if (name.charAt(0) == 'A') {
            System.out.println("You are in the club!");
        } else if (name.charAt(0) == 'a') {
            System.out.println("You are in the club!");
        } else
            System.out.println("Sorry, you are not in the club");

        System.out.println("\n---Task 2 ---\n");

        String address = ScannerHelper.getAnAddress().toLowerCase();

        if (address.contains("chicago")) {
            System.out.println("You are in the club");
        } else if (address.contains("des plaines")) {
            System.out.println("You are welcome to join the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }

        System.out.println("\n---Task 3 ---\n");

        String favColors = ScannerHelper.getFavColors().toLowerCase();

        if (favColors.toLowerCase().contains("red") && favColors.toLowerCase().contains("green"))
                System.out.println("Green and red are in the list");
        else if (favColors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else if (favColors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not on the list");


        System.out.println("\n---Task 4 ---\n");

        String str = "  Java is Fun  ";
        str = str.trim().toLowerCase();

        String word1 = str.substring(0,4);
        String word2 = str.substring(5,7);
        String word3 = str.substring(str.length()-3);

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);
    }

}
