public class Words {

     protected static String[] words = {"dexter", "amazing", "egg", "gudetama", "software", "snorlax", "keyboard", "hello", "testing", "some", "arrays", "mouse", "hover", "destroy", "snow", "animation", "rhythm", "competition", "hangman"};

     protected static String getRandomWord(){
          return words[(int) (Math.random() * words.length)];
     }
}
