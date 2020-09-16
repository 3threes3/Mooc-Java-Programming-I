
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name; 
        String lname; 
        String number;
        
        while(true){
            System.out.println("First Name: ");
            name = scanner.nextLine();
            if (!name.isEmpty()){
                System.out.println("Last Name: ");
                lname = scanner.nextLine(); 
                System.out.println("Identification number: ");
                number = scanner.nextLine(); 
                infoCollection.add(new PersonalInformation (name, lname, number));
            } else {
                break;
            }
        }
        
        for(PersonalInformation iterator: infoCollection){
            System.out.println(iterator.getFirstName() + " " + iterator.getLastName());
        }

    }
}
