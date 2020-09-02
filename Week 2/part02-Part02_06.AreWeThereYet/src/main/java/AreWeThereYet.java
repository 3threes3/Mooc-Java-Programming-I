
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int yet = 0; 
        
        while (yet != 4) {
            System.out.println("Give a number:");
            yet = Integer.valueOf(scanner.nextLine());
        }

    }
}
