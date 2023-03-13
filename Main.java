import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        int highscore = 0;
        while (playAgain) {
            String word = Words.getRandomWord();
            char[] letters = word.toCharArray();

            char[] hiddenWord = new char[letters.length];
            ArrayList<Character> guessedLetters = new ArrayList<>();
            int lives = 8;
            boolean wordGuessed = false;
            for (int i = 0; i < letters.length; i++) hiddenWord[i] = '_';
            while (lives > 0 && !wordGuessed) {
                Display.displayNewTurn(hiddenWord, lives, guessedLetters);
                char letter = Guess.getGuess(guessedLetters);
                boolean found = false;
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == letter) {
                        hiddenWord[i] = letter;
                        found = true;
                        if (guessedLetters.contains(letter) == false) guessedLetters.add(letter);
                    }
                }
                if (!found) {
                    lives--;
                    System.out.println("Incorrect guess :(");
                    guessedLetters.add(letter);
                }
                wordGuessed = new String(hiddenWord).equals(word);
            }
            if (wordGuessed) {
                System.out.println("Wowee! You guessed the word " + word);
                if (highscore < lives){
                    highscore = lives;
                }
            } else {
                System.out.println("Sorry, you lost. The word was " + word);
                System.out.println(Display.getHangmanDrawing(lives));
            }
            System.out.println("Your current highscore is: " + highscore);
            System.out.print("Would you like to play again? (Y/N) ");
            String answer = scanner.nextLine().toLowerCase();
            playAgain = answer.equals("y") || answer.equals("yes");
        }
    }


}