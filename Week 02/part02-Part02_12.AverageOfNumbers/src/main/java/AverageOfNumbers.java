
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int currentNumber; 
        int sum = 0;
        int amountOfNumbers = 0;
        double average; 
        
        while (true){
            System.out.println("Give a number:");
            currentNumber = Integer.valueOf(scanner.nextLine());
            if (currentNumber != 0){
                sum = sum + currentNumber;
                amountOfNumbers++;
            } else { 
                break;
            }
        }
        
        average = 1.0 * sum / amountOfNumbers;
        System.out.println("Average of the numbers: " + average);

    }
}
