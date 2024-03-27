package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static int[] generateNumbers() {
        int[] tickets = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(tickets, randomNumber));

            //unique number
            tickets[i] = randomNumber;
        }

        return tickets;
    }

    /**
     * JAVA DOC
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static boolean bonarySearch(int[] array, int numberToSearchFor) {
        //Array must be sorted
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTicket(int tickets[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(tickets[i] + " | ");
        }
    }
    public static void main(String[] args) {
        int[] tickets = generateNumbers();
        Arrays.sort(tickets);
        printTicket(tickets);
    }
}
