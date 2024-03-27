package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        Random random = new Random();
        int die = random.nextInt(6) + 1;

        int boardSpaces = 20;
        int dieRolls = 5;

        int spacesCovered = 0;

        for (int i = 0; i < dieRolls; i++) {
            spacesCovered += die;
            if (spacesCovered == 20) {
                System.out.println("Roll #" + (i+1) +": You've rolled a " + die +". You're on space "
                        + die + ". Congrats, you win!" );
                break;
            } else if (spacesCovered > 20 || i == dieRolls - 1) {
                System.out.println("Roll #" + (i+1) +": You've rolled a " + die +". Game Over, you lose!" );
                break;
            }

            System.out.println("Roll #" + (i+1) +": You've rolled a " + die +". You are now on space "
                    + die + " and have " + (boardSpaces - spacesCovered) + " more to go.");
            die = random.nextInt(6) + 1;
        }
    }
}
