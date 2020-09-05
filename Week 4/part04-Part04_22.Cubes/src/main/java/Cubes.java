
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp;
        int tempint;

        while (true) {
            temp = scanner.next();
            if (temp.equals("end")) {
                break;
            } else {
                tempint = Integer.valueOf(temp);
                System.out.println((tempint*tempint*tempint));
            }
            
        }

    }
}
