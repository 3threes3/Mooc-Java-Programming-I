
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int currentNumber = -1; 
        int negatives = 0;
        
        while (currentNumber != 0){
            System.out.println("Give a number:");
            currentNumber = Integer.valueOf(scanner.nextLine()); 
            if (currentNumber < 0){
                negatives++;
            }
        }
        
        System.out.println("Number of negative numbers: " + negatives);

    }
}
