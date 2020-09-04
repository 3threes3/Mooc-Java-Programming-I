
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        
        ArrayList <Integer> list = new ArrayList();
        int current = 0;
        
        while (current != 9999){
            current = scanner.nextInt();
            list.add(current);
        }
        
        int smallest = list.get(0);
        
        for (Integer iterator: list){
            if (iterator < smallest){
                smallest = iterator;
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
