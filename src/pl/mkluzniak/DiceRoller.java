package pl.mkluzniak;

import java.util.Random;

public class DiceRoller {

    Random random; //declare random and number outside of class to be global
    int number = 0;

    DiceRoller() {

        random = new Random();

        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1; //selecting from 0 do 5 that is +1 to be max 6
        System.out.println(number);
    }
}
