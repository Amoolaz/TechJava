package string_methods;

public class _10_substring_methods {
    public static void main(String[] args) {

        /*
        - return
        - returns another String
        - non-static
        - its is overloaded and takes either one or two int index arguments

         */

        String s = "TechGlobal";

        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1);

        // Get "Tech"

        System.out.println(s.substring(0, 4));

        System.out.println(s.substring(2, 15)); // StringIndexOutOfBoundsException




    }
}
