
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String whatever; 
        String [] split; 
        
        while (true) { 
            whatever = scanner.nextLine();
            if(whatever.isEmpty()){
                break;
            } else { 
                split = whatever.split(" "); 
                System.out.println(split[split.length - 1]);
            }
        }


    }
}
