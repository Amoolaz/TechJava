package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "2860 south river road des plaines il";
        String s2 = "12334 @!#$!@ Tech Global";
        System.out.println("String:\" " + s1 + "\" has: \n" + countLetters(s1) + "letters");
        System.out.println("String:\" " + s2 + "\" has: \n" + countLetters(s2) + "letters");

    }
    /*
    Create a public static method which will take a String and returns the number of Letters
     */
    //"2860 south river road des plaines il"-> 26
    //"12334 ^*&^&* TechGlobal"-> 10

    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) { // 0, 1, 2, 3, .....L - 1
            if (Character.isLetter(s.charAt(i))) {
                counter++;

            }
        }
        return counter;
    }

}


               /*
        Create a public static method named as countUpperCases() which will take a String
        and counts the upper case letters then returns it
         */
        //"12334 @!#$!@ TechGlobal" -> 2
        //"TeChGloBal" -> 4
        //"123123 TeChGloBal #$%#$%" -> 4

