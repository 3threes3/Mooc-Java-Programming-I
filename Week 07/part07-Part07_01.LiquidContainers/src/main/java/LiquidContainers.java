
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = "First: 0";
        String second = "Second: 0";

        while (true) {

            System.out.println(first + "/100");
            System.out.println(second + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            if(input.split(" ")[0].equals("add")){
                int amountToAdd = Integer.valueOf(input.split(" ")[1]);
                if(amountToAdd < 0){
                    amountToAdd = 0;
                }
                if(Integer.valueOf(first.split(" ")[1]) + amountToAdd > 100){
                    first = "First: 100";
                } else {
                    first = "First: " + String.valueOf(Integer.valueOf(amountToAdd + Integer.valueOf(first.split(" ")[1])));
                }
            }
            if(input.split(" ")[0].equals("move")){
                int amountToMove = Integer.valueOf(input.split(" ")[1]);
                if(amountToMove < 0){
                    amountToMove = 0;
                }
                if(amountToMove > Integer.valueOf(first.split(" ")[1])){
                    amountToMove = Integer.valueOf(first.split(" ")[1]);
                }
                first = "First: " + String.valueOf(Integer.valueOf(first.split(" ")[1]) - amountToMove);
                if(Integer.valueOf(second.split(" ")[1]) + amountToMove > 100){
                    second = "Second: 100";
                } else { 
                    second = "Second: " + String.valueOf(Integer.valueOf(second.split(" ")[1]) + amountToMove);
                }
                
            }
            if(input.split(" ")[0].equals("remove")){
                int amountToRemove = Integer.valueOf(input.split(" ")[1]);
                if(Integer.valueOf(second.split(" ")[1]) - amountToRemove < 0){ 
                    second = "Second: 0";
                } else { 
                    second = "Second: " + String.valueOf(Integer.valueOf(second.split(" ")[1]) - amountToRemove);
                }
            }
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
