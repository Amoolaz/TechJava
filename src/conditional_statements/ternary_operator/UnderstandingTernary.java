package conditional_statements.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {
        /*
        F -> for female
        M -> for male
         */

        char gender = ' ';

        String name = gender == 'J'|| gender == 'f'? "Jane": "John";

        System.out.println(name);
    }
}
