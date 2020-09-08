
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        start(birds, scan);

    }

    public static void add(ArrayList<Bird> birds, Scanner scan) {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        birds.add(new Bird(name, latinName));
    }

    public static void observation(String name, ArrayList<Bird> birds) {
        boolean found = false;
        for (Bird iterator : birds) {
            if (name.equals(iterator.getName())) {
                iterator.setTimesSeen(iterator.getTimesSeen() + 1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public static void printAll(ArrayList<Bird> birds) {
        for (Bird iterator : birds) {
            System.out.println(iterator);
        }
    }

    public static void print(String bird, ArrayList<Bird> birds) {
        for (Bird iterator : birds) {
            if (bird.equals(iterator.getName())) {
                System.out.println(iterator);
            }
        }
    }

    public static void start(ArrayList<Bird> birds, Scanner scan) {
        String command = "";
        while (!(command.equalsIgnoreCase("quit"))) {
            System.out.print("? ");
            command = scan.nextLine();
            if(command.equalsIgnoreCase("add")){
                add(birds, scan);
            } else if(command.equalsIgnoreCase("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                observation(name, birds);
            } else if(command.equalsIgnoreCase("All")){
                printAll(birds);
            } else if(command.equalsIgnoreCase("one")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                print(name, birds);
            }
        }
    }

}
