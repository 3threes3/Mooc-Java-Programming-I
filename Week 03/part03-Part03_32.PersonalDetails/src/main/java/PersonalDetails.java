
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String newcomer; 
        String [] data; 
        int peopleCount = 0; 
        int longest = 0;
        String longestName = "";
        int years = 0;
        double births;
        
        while (true){
            newcomer = scanner.nextLine();
            if(newcomer.isEmpty()){
                break; 
            } else { 
                data = newcomer.split(","); 
                if (data[0].length() > longest){
                    longestName = data[0];
                    longest = data[0].length();
                }
                years = years + Integer.valueOf(data[1]); 
                peopleCount++;
            }
        }
        
        births = 1.0 * years / peopleCount;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years " + births);


    }
}
