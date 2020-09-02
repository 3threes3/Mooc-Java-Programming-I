
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String carryOver = ""; 
        
        while (!"no".equals(carryOver)){
            System.out.println("Carry on?");
            carryOver = scanner.nextLine();
        }

    }
}
