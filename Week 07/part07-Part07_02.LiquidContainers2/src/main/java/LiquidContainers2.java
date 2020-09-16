
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container(); 
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            System.out.print("> ");

            String input = scan.nextLine();            
            if(input.split(" ")[0].equals("add")){
                first.add(Integer.valueOf(input.split(" ")[1]));
            }
            if(input.split(" ")[0].equals("remove")){
                second.remove(Integer.valueOf(input.split(" ")[1]));
            }
            if(input.split(" ")[0].equals("move")){
                first.move(Integer.valueOf(input.split(" ")[1]), second);
            }
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
