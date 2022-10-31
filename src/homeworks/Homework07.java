package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
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

        String [] kitchenObjects = {"Plate", "spoon", "fork", "Knife","cup","Mixer"};
        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList(kitchenObjects));
        System.out.println(kitchen);

       int upperCase = 0;
       int lowerCase = 0;
       int elementPorp = 0;
       int elementStartsPorp = 0;


        for (String element : kitchen) {
            if(Character.isUpperCase(element.charAt(0)))upperCase++;
            if(Character.isLowerCase(element.charAt(0)))lowerCase++;
            if(element.toLowerCase().contains("p"))elementPorp++;
            if(element.toLowerCase().startsWith("P"))elementStartsPorp++;
        }
        System.out.println("Elements that start with uppercase = "  + upperCase);
        System.out.println("Elements that start with lowercase = " + lowerCase);
        System.out.println("Elements having P or p = " + elementPorp);
        System.out.println("Elements starting with P or p " + elementStartsPorp);

        System.out.println("\n---Task 10---\n");

        Integer [] numbers10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        ArrayList <Integer> task10 = new ArrayList<>(Arrays.asList(numbers10));
        System.out.println(task10);

        int elementsDivided10 = 0;
        int elementsEvenAndGreaterThan15 = 0;
        int elementsOddAndLessThan20 = 0;
        int elementsLessThan15orGreaterThan50 = 0;

        for(Integer element : numbers10){
            if(element % 10 == 0)elementsDivided10++;
            if(element % 2 == 0 && element > 15)elementsEvenAndGreaterThan15++;
            if(element % 2 == 1 && element < 20)elementsOddAndLessThan20++;
            if(element < 15 && element > 50)elementsLessThan15orGreaterThan50++;
        }

        System.out.println("Elements that can be divided by 10 = " + elementsDivided10);
        System.out.println("Elements that are even and greater than 15 = " + elementsEvenAndGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + elementsOddAndLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + elementsLessThan15orGreaterThan50);
    }
}



