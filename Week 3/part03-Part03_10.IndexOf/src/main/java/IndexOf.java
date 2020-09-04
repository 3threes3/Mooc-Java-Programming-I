
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        int looking = scanner.nextInt();
        
        System.out.println(looking + " is at index " + list.indexOf(looking));
        if(list.indexOf(looking) != list.lastIndexOf(looking)){
            System.out.println(looking + " is at index " + list.lastIndexOf(looking));
        }

        // implement here finding the indices of a number
    }
}
