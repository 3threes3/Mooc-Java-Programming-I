
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        String id;
        String name;
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item newlyCreated = new Item(id, name);
            
            if(!(archive.contains(newlyCreated))){
                archive.add(newlyCreated);
            }
        }
        
        System.out.println("==Items==");
        for(Item iterator: archive){
            System.out.println(iterator);
        }


    }
}
