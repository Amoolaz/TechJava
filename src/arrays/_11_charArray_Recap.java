package arrays;

import java.util.Arrays;

public class _11_charArray_Recap {
    public static void main(String[] args) {
        // Create a char array which will hold your name's letters with both ways (new keyword, curly brackets)
        // ['A','m','a','l']

        char [] initials = new char[4];
        initials[0] = 'A';
        initials[1] = 'm';
        initials[2] = 'a';
        initials[3] = 'l';
        char [] initials2 = {'A','m', 'a', 'l'};

        System.out.println(Arrays.toString(initials));
        System.out.println(Arrays.toString(initials2));

        initials[0] = 'A';
        initials[0] = initials[3];
        initials[0] = initials[2];
        System.out.println(Arrays.toString(initials));

        //Amal
        System.out.println("\n for each loop print");
        for (char in : initials2){
            System.out.print(in);
        }

        System.out.println("\nfori loop print");
        for (int i = 0; i < initials.length; i++) {
            System.out.println(initials2[i]);

        }



    }
}
