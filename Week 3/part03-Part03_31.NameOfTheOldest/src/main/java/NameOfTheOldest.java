
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String newcomer;
        String [] data;
        int oldest = 0;
        String name = ""; 
        
        while (true) { 
            newcomer = scanner.nextLine();
            if (newcomer.isEmpty()){
                break;
            } else {
                data = newcomer.split(",");
                if (Integer.valueOf(data[1]) > oldest){
                    oldest = Integer.valueOf(data[1]);
                    name = data[0];
                }
            }
        }
        
        System.out.println("Name of the oldest: " + name);


    }
}
