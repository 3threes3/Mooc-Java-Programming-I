
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String aux;

        while (true) {
            System.out.print("Name: ");
            aux = scanner.nextLine();
            if (!aux.equals("")) {
                items.add(new Item(aux));
            } else {
                break;
            }
        }
        
        for(Item iterator: items){
            System.out.println(iterator);
        }

    }
}
