
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int duration;

        while (true) {
            System.out.println("Name: ");
            name = scanner.nextLine();
            if (!name.equals("")) {
                System.out.println("Duration: ");
                duration = Integer.valueOf(scanner.nextLine());
                programs.add(new TelevisionProgram(name, duration));
            } else {
                break;
            }
        }

        System.out.println("Program's maximum duration? ");
        int maximum = scanner.nextInt();

        for (TelevisionProgram iterator : programs) {
            if (iterator.getDuration() <= maximum) {
                System.out.println(iterator);
            }
        }

    }
}
