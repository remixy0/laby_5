package Zad5;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        Character [] characters = new Character[3];
        characters[0] = new Wizard(15);
        characters[1] = new Wizard(11);
        characters[2] = new Knight(15);

        characters[1].walkForward();
        characters[1].defense2();

        characters[2].walkRight();
        characters[2].defense1();

        characters[1].mainAttack(characters[2]);
        characters[2].specialAttack(characters[1]);
        characters[1].specialAttack(characters[0]);
        characters[1].mainAttack(characters[0]);

        characters[0].getHealth();

        characters[0].walkBackward();
        characters[0].introduceYourSpecialAbility();
        characters[2].introduceYourSpecialAbility();

        characters[1].introduceYouself();
        characters[2].getType();


    }
}
