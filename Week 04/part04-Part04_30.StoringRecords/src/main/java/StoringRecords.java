
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        String temp; 
        String [] temparr;
        String name; 
        int age;
        
        try (Scanner scanner = new Scanner (Paths.get(file))){
            
            while (scanner.hasNextLine()){
                temp = scanner.nextLine();
                temparr = temp.split(","); 
                name = temparr[0]; 
                age = Integer.valueOf(temparr[1]); 
                persons.add(new Person(name, age));
            }
            
        } catch (Exception e){
            
        }

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
