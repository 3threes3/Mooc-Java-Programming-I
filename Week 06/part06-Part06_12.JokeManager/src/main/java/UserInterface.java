
import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String aux = this.scanner.nextLine();
            if (aux.equals("X")){
                break;
            }
            if(aux.equals("1")){
                System.out.println("Write the joke to be added:");
                this.manager.addJoke(this.scanner.nextLine());
            }
            if(aux.equals("2")){
                System.out.println(this.manager.drawJoke());
            }
            if(aux.equals("3")){
                this.manager.printJokes();
            }
        }

    }
}
