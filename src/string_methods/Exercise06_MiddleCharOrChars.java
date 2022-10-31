package string_methods;

import utilities.ScannerHelper;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {

        /*
        Olena -> e -> s.charAt(s.length()/2)
        Ali -> l    -> 1 s.charAt(s.length()/2)
        Suzanne -> a -> 3 s.charAt(s.length()/2)

        John -> oh  ->  s.substring(s.length()/2-1, s.length()/2+1)
        Abdallah -> al  -> s.substring(s.length()/2-1, s.length()/2+1)
        Yildiz -> ld  -> s.substring(s.length()/2-1, s.length()/2+1)

        Write a program that asks user to enter a name
        Find the middle character if the name has odd count of characters
        Find the middle 2 characters if the name has even count of characters

        Olena -> Middle char is = e
        Yildiz -> Middle chars are = ld

         */

        String name = ScannerHelper.getAName();

        if(name.length() % 2 ==0){
            //Even - middle 2 chars
            System.out.println("Middle chars are = " + name.substring(name.length()/2-1, name.length()/2+1));

        }
        else {
            if(name.length() % 2 ==0){
                //Even - middle 2 chars
                System.out.println("Middle chars are = " + name.substring(name.length()/2-1));
            }
            else{

            }
            //Odd - middle 1 char
            System.out.println("Middle char is = " + name.charAt(name.length()/2));
        }


    }
}
