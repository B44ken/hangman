import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {
    ArrayList<String> words;
    Random rand;

    public Dictionary() {
        rand = new Random();
        File file = new File("food.txt");
        words = new ArrayList<String>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                words.add(scan.nextLine());
            }
            scan.close();
        } catch (Exception error) {
            System.out.println("file not found");
        }
    }

    public String getWord() {
        int random = rand.nextInt(words.size());
        return words.get(random);
    }
}
