public class Hangman {
    String word;
    String guesses = "";
    String badGuesses = "";
    int chances;

    public Hangman(String word, int chances) {
        this.word = word;
        this.chances = 5;
    }

    public String guess(String letter) {
        if(letter.length() != 1) {
            chances--;
            return "only guess one letter at a time";
        } else if(guesses.contains(letter)) {
            chances--;
            return "you already guessed that letter";
        } else if(!word.contains(letter)) {
            badGuesses += letter;
            guesses += letter;
            chances--;
            return "that letter isn't in the word";
        } else {
            guesses += letter;
            return "good";
        }
    }

    public boolean didWin() {
        return hideWord().equals(word);
    }

    public String hideWord() {
        String[] wordSplit = word.split("");
        String hiddenWord = "";

        for (String letter : wordSplit) {
            if (guesses.contains(letter)) {
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }
        }

        return hiddenWord;
    }
}