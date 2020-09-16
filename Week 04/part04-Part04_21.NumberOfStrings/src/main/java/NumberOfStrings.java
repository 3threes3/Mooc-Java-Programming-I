
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp; 
        int counter = 0;
        while (true) { 
            temp = scanner.next(); 
            if (temp.equals("end")){
                break;
            } else { 
                counter++; 
            }
        }
        System.out.println(counter);

    }
}
