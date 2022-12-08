import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        Hangman hangman = new Hangman(dict.getWord(), 5);
        
        System.out.println("welcome to hangman! you get " + hangman.chances + " chances to guess the word");
        System.out.println(hangman.hideWord());
        
        while(hangman.chances > 0 && !hangman.didWin()) {
            // get the guess and try it
            System.out.print("guess: ");
            String guess = scan.nextLine();
            String result = hangman.guess(guess);
            
            // tell the user what happened
            if(!result.equals("good")) {
                System.out.println(result);
            }

            // show the user the current state of the game
            System.out.print(hangman.hideWord());
            if (hangman.badGuesses.length() > 0) {
                System.out.print(" (not " + hangman.badGuesses + ")");
            }
            System.out.println(" (" + hangman.chances + " chances left)");
        }

        // win or lose
        if(hangman.didWin()) {
            System.out.println("you win!");
        } else if(hangman.chances == 0) {
            System.out.println("you lose:( the word was " + hangman.word);
        }
        scan.close();
    }
}
