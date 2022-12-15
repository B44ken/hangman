import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dictionary dict = new Dictionary("food.txt");
        Hangman hangman = new Hangman(dict.getRandomWord(), 8);
        
        System.out.println("welcome to hangman! you get " + hangman.chances + " chances to guess the word");
        System.out.println(hangman.hideWord());
        
        
        while(hangman.chances > 0 && !hangman.didWin()) {
            // get the guess and try it
            // YOUR CODE HERE
            
            // tell the user what happened
            // result string is an error
            // YOUR CODE HERE

            // show the user the current state of the game
            // example output:
            // _____ (not a, b, e, f) (7 chances left)
            // YOUR CODE HERE
        }

        // tell the user if they won or lost
        // if they lost, say what the word was
        // YOUR CODE HERE

        scan.close();
    }
}
