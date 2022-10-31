package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below the cities in int
        Chicago
        Berlin
        Miami

        Print the size of the ArrayList
        Print the ArrayList

        Expected:
        3
        [Chicago, Berlin, Miami]
         */

        System.out.println("\n---Task 1---\n");

        ArrayList<String> cities = new ArrayList<>(); // capacity is 10
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");

        System.out.println(cities);

        System.out.println("\n---Task 2---\n");

        /*
        Update Miami to be Evanston
        Print the Arraylist

        Expected:
        [Chicago, Berlin, Evanston]
         */

        cities.set(2, "Evanston");

        System.out.println(cities);


        System.out.println("\n---Task 3---\n");
        /*
        Task
        Remove Berlin
        Print the ArrayList
         */

        //cities.remove(1);
        cities.remove("Berlin");
        System.out.println(cities);

        System.out.println(cities.size());

        System.out.println(cities.remove(0)); // [Chicago, Evanston]

        System.out.println(cities.remove("evanston")); // false

        System.out.println(cities); // [Evanston]
        System.out.println(cities.size()); // 1

        System.out.println("\n---Task 4---\n");
                    /*
            TASK
            Add below cities to ArrayList
            New York
            Rome
            Gent

            Print the ArrayList
            Print the size

            EXPECTED:
            [Evanston, New York, Rome, Ghent]
            4
             */


        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n---Task 5---\n");

        /*
        Task
        Remove all elements
        Print the ArrayList
        Print the size
         */

        // cities.clear();
        cities.removeAll(cities);

        System.out.println(cities);
        System.out.println(cities.size());


    }
}
