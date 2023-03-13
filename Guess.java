import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Guess {
    static Scanner scanner = new Scanner(System.in);
    public static char getGuess(ArrayList<Character> guessedWords){
        char letter = 'a'; //A just to initialize it
        boolean validGuess = false;
        while (!validGuess){
            System.out.print("Guess a letter: ");
            try {
                letter = toLowerCase(scanner.nextLine().charAt(0));
            }
            catch (Exception e){
                System.out.println("Error: Invalid input, please try again");
            }
            if (guessedWords.contains(letter)) {
                System.out.println("You have already guessed this letter. Please try again");
            } else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                validGuess = true;
            } else
            {
                System.out.println("Error: Input must be a letter from a-z");
            }
        }
        return letter;
    }
}
