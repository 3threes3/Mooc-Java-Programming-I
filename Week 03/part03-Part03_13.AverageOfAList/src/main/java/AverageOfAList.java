
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        ArrayList<Integer> numbers= new ArrayList<>();
        // and prints it.
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);

        numbers.remove(Integer.valueOf(2));
        
        System.out.println(numbers);
    }
}
