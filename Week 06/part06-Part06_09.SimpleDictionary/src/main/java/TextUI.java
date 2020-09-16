
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary dict;
    private Scanner scanner;

    public TextUI(Scanner sc, SimpleDictionary dict) {
        this.dict = dict;
        this.scanner = sc;
    }

    public void start() {
        String command;
        while (true) {
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                dict.add(word, translation);

            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = this.scanner.nextLine();
                if (this.dict.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println(this.dict.translate(toTranslate));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
