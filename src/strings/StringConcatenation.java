package strings;

public class StringConcatenation {
    public static void main(String [] args){

        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1 + s2; // "Hello" + "World"

        System.out.println(s3); // Hello World

        /*
        Task
        Create 2 strings to store your firstName and lastName
        Then concatenate them with a third String called as full name
        Then print the full name
         */
        System.out.println("\n----------Concatenation with + operator------\n");

        String firstName = "Amal";
        String lastName = "AbuKhroub";
        String fullName = firstName + "" + lastName;
        System.out.println(fullName);

        System.out.println(firstName);
        System.out.println("\n----------Concatenation with + operator------\n");
        String fullName2 = firstName.concat(lastName);

        System.out.println(lastName);













    }
}
