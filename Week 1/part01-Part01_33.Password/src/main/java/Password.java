
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String actualPassword = "Caput Draconis"; 
        System.out.println("Password?");
        String enteredPassword = scan.nextLine(); 
        if (enteredPassword.equals(actualPassword)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
