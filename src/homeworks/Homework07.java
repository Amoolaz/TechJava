package homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n---Task 1 ---\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n---Task 2 ---\n");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));

        System.out.println(colors);

        System.out.println("\n---Task 3---\n");

        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);

        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);

        System.out.println("\n---Task 4---\n");
        //Istanbul, Berlin, Madrid, Paris

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n---Task 5---\n");

        ArrayList<String> marvelCharacters = new ArrayList<>();

        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panter");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");

        System.out.println(marvelCharacters);

        if (marvelCharacters.contains("Wolwerine")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\n---Task 6---\n");

        //Hulk, Black Widow, Captain America, Iron Man

        ArrayList<String> avengersCharacter = new ArrayList<>();

        avengersCharacter.add("Hulk");
        avengersCharacter.add("Black Widow");
        avengersCharacter.add("Captain America");
        avengersCharacter.add("Iron Man");

        Collections.sort(avengersCharacter);
        System.out.println(avengersCharacter);

        if(avengersCharacter.contains("Hulk")) {
            if (avengersCharacter.contains("Iron Man")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }


        }

        System.out.println("\n---Task 7---\n");
        //A, x, $, %, 9, *, +, F, G
        ArrayList<Character> characters7 = new ArrayList<>();

        characters7.add('A');
        characters7.add('x');
        characters7.add('$');
        characters7.add('%');
        characters7.add('9');
        characters7.add('*');
        characters7.add('+');
        characters7.add('F');
        characters7.add('G');

        System.out.println(characters7);

        for (Character character : characters7) {
            System.out.println(character);
        }

        System.out.println("\n---Task 8---\n"); //not done yet

        ArrayList<String> task8 = new ArrayList<>();

        task8.add("Desk");
        task8.add("Laptop");
        task8.add("Mouse");
        task8.add("Monitor");
        task8.add("Mouse-Pad");
        task8.add("Adapter");

        System.out.println(task8);

        Collections.sort(task8);
        System.out.println(task8);

        int hasMorm = 0;
        int noAorEOrae = 0;

      for (String element : task8){
          if(element.toUpperCase().startsWith("M"))hasMorm++;
          if(!element.toUpperCase().contains("A") &&!element.toUpperCase().contains("E")) noAorEOrae++;

      }
        System.out.println(hasMorm);
        System.out.println(noAorEOrae);

        System.out.println("\n---Task 9--\n");

        //ArrayList<String> kitchen9

    }
}



