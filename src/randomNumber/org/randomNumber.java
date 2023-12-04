package randomNumber.org;

import java.util.Random;
import java.util.Scanner;


public class randomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        // Genero un array di numeri random compresi tra 1 e 10
        int numbersArray = randomGenerator.nextInt(11);

        //Creo una variabile per i tentativi dell'utente
        int tryNumber;

        //Chiedo all'utente di darmi numeri fin quando non indovina
        do {
            System.out.print("Guess the number (0 to 10): ");
            tryNumber = scanner.nextInt();

            if (tryNumber < numbersArray) {
                System.out.println("Too short. Try again!");
            } else if (tryNumber > numbersArray) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Compliments! You guessed the number!");
            }
        } while (tryNumber != numbersArray);

        // Chiudo lo scanner
        scanner.close();

    }
}
