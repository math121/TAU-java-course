package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    public static boolean isValidGuess(String guess) {
        return guess.toLowerCase().equals(Coin.HEADS) || guess.toLowerCase().equals(Coin.TAILS);
    }

    public static void setPlayer2Guess(String player1Guess, Player player2) {
        if (player1Guess.equals(Coin.HEADS)) {
            player2.setGuess(Coin.TAILS);
        } else {
            player2.setGuess(Coin.HEADS);
        }
    }

    public static String flipAndDetermineWinner(Player player1, Player player2) {
        Coin coin = new Coin();
        coin.flip();
        System.out.println("\nThe coin side: " + coin.getSide());

        if (player1.getGuess().equals(coin.getSide())) {
            return player1.getName();
        }
        return player2.getName();
    }

    public static void printDetailsOfGame(Player player1, Player player2) {
        System.out.println("Guesses:");
        System.out.println(player1.getName() + ": " + player1.getGuess());
        System.out.println(player2.getName() + ": " + player2.getGuess());

        System.out.println("\nThe winner is: " + flipAndDetermineWinner(player1, player2));
    }

    public static void main(String[] args) {
        Player player1 = new Player("Mary");
        Player player2 = new Player("Aria");

        Scanner scanner = new Scanner(System.in);
        String guess;

        do {
            System.out.println(player1.getName() + ", Choose Heads or Tails");
            guess = scanner.nextLine();
        } while (!isValidGuess(guess));

        player1.setGuess(guess.toLowerCase());
        setPlayer2Guess(player1.getGuess(), player2);

        printDetailsOfGame(player1, player2);

    }
}
