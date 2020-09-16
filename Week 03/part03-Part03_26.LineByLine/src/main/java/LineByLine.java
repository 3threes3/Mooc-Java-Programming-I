
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrase;

        String[] words;

        while (true) {
            phrase = scanner.nextLine();
            if (phrase.isEmpty()) {
                break;
            } else {
                words = phrase.split(" ");
                for (String iterator : words) {
                    System.out.println(iterator);
                }
            }
        }

    }
}
