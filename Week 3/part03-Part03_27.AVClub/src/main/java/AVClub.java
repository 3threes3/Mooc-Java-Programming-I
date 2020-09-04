
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String whatever;
        String[] split;

        while (true) {
            whatever = scanner.nextLine();
            if (whatever.isEmpty()) {
                break;
            } else {
                split = whatever.split(" ");
                for (String iterator : split) {
                    if (iterator.contains("av")) {
                        System.out.println(iterator);
                    }
                }

            }
        }

    }
}
