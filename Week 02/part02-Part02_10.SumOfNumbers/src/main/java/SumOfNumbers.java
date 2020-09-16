
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int currentNumber; 
        int sum = 0; 
        
        while (true) {
            System.out.println("Give a number:");
            currentNumber = Integer.valueOf(scanner.nextLine()); 
            if (currentNumber != 0){
                sum = sum + currentNumber;
            } else {
                break;
            }
        }
        
        System.out.println("Sum of the numbers: " + sum);
       
    }
}
