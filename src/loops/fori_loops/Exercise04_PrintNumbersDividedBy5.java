package loops.fori_loops;

public class Exercise04_PrintNumbersDividedBy5 {
    public static void main(String[] args) {
    /*
    Write a Java program to check numbers from 1 to 50 that dividable by 5
    Start point 1
    End point 50
    Example:
    5
    10
    15
    Update: Increment
     */

        for (int i = 1; i < 50; i++) {
            if (i % 5 == 0) System.out.println(i);

        }
    }
}
