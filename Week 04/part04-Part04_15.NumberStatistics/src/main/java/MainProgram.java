
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics test1 = new Statistics();
        Statistics test2 = new Statistics();
        Statistics test3 = new Statistics();
        
        System.out.println("Enter numbers:");
        int aux; 
        while (true) { 
            aux = scanner.nextInt(); 
            if (aux == -1){
                break;
            } else { 
                test1.addNumber(aux);
                if (aux % 2 == 0) { 
                    test2.addNumber(aux);
                } else { 
                    test3.addNumber(aux);
                }
            }
        }
        System.out.println("Sum: " + test1.sum());
        System.out.println("Sum of even numbers: " + test2.sum());
        System.out.println("Sum of odd numbers: " + test3.sum());

    }
}
