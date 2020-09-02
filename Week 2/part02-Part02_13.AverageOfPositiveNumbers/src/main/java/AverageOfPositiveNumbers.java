
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int currentNumber; 
        int sum = 0; 
        int amountOfPositives = 0; 
        double average; 
        
        while (true){
            System.out.println("Give a number: ");
            currentNumber = Integer.valueOf(scanner.nextLine()); 
            if (currentNumber > 0){
                sum = sum + currentNumber; 
                amountOfPositives++; 
            } else if (currentNumber == 0){
                break; 
            }
        }
        
        if (amountOfPositives > 0) { 
            average = 1.0 * sum / amountOfPositives; 
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
