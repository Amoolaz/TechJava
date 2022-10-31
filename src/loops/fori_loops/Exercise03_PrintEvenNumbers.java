package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from 0 to 10 (o and 10 are included)
        Expected output
        0
        2
        4
        6
        8
        10
         */
        // not recommended
        // for (int h = 0; h <= 10; h += 2) {
        //   System.out.println(h);
        // }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) System.out.println(i);


        }
    }}