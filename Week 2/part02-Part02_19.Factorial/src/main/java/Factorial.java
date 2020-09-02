
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; 
        
        System.out.print("Give a number: ");
        number = scanner.nextInt();
        
        int factorial = 1; 
        
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
