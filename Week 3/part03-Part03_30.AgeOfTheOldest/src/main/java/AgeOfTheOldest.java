
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String newcomer;
        String [] data;
        int oldest = 0;
        
        while (true) { 
            newcomer = scanner.nextLine();
            if (newcomer.isEmpty()){
                break;
            } else {
                data = newcomer.split(",");
                if (Integer.valueOf(data[1]) > oldest){
                    oldest = Integer.valueOf(data[1]);
                }
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
