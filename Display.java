import java.util.ArrayList;

public class Display {
    public static void displayNewTurn(char[] hiddenWord, int lives, ArrayList<Character> guessedLetters){
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Lives: " + lives);
        System.out.println("Word: " + new String(hiddenWord));
        System.out.println("Letters guessed:");
        System.out.println(guessedLetters);
        System.out.println(Display.getHangmanDrawing(lives));
    }
    public static String getHangmanDrawing(int lives) {
        String[] drawing = new String[8];
        drawing[0] = "  +---+\n      |\n      |\n      |\n      |\n      |\n=========";
        drawing[1] = "  +---+\n      |\n      |\n      |\n      |\n      |\n=========";
        drawing[2] = "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========";
        drawing[3] = "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========";
        drawing[4] = "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========";
        drawing[5] = "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========";
        drawing[6] = "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========";
        drawing[7] = "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========";

        switch (lives){
            case 8:
                return drawing[0];
            case 7:
                return drawing[1];
            case 6:
                 return drawing[2];
            case 5:
                return drawing[3];
            case 4:
                return drawing[4];
            case 3:
                return drawing[5];
            case 2:
                return drawing[6];
            case 1:
                return drawing[7];
            case 0:
                return "";
            default:
                return "Error, invalid amount of lives";
        }
    }
}
