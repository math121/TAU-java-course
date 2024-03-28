package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void  createNewFile() {
        File file = new File("resources/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error has occurred");
            e.printStackTrace();
        }
    }

    public static void  createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");

        try (Scanner fileReader = new Scanner(file)) {

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } /*finally {
            // good for closing resources in finally block if it does not support that with the try()
            //fileReader.close();
        }*/
    }
    public static void main(String[] args) throws IOException {
        //createNewFile();
        //numbersExceptionHandling();
        createNewFileRethrow();
    }
}
