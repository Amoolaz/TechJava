package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {
        /*
        Write a Java program that prints numbers backwards starting from 100 to 0 (100 and 0 are included)
        Expected output
        100
        99
        .
        2
        1
        0
        Start point 100
        End point 0
        Update decrement
         */
        for (int j = 100; j >= 0; j--) {
            System.out.println(j);
        }
    }
}