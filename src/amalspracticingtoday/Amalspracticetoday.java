package amalspracticingtoday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Amalspracticetoday {
    public static void main(String[] args) {

        String[] characters = {"Hulk", "Black Widow", "Captain America", "Iron Man"};
        ArrayList<String> avengersCharacters = new ArrayList<>(Arrays.asList(characters));

        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);
        boolean isHulk = false;
        boolean isIronMan = false;

        for (String avengersCharacter : avengersCharacters) {
            if (avengersCharacter.equals("Hulk")) isHulk = true;
            else if (avengersCharacter.equals("Iron Man")) isIronMan = true;


            if (isHulk && isIronMan) break;

        }
        System.out.println(isHulk && isIronMan);
    }}







