
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        
        String file = scanner.nextLine(); 
        String temp;
        String temparr [] = new String [2];
        String name; 
        int age; 
        
        try (Scanner scanner2 = new Scanner (Paths.get(file))){ 
            
            while(scanner2.hasNextLine()){ 
                temp = scanner2.nextLine();
                temparr = temp.split(",");
                name = temparr[0]; 
                age = Integer.valueOf(temparr[1]);
                if (age != 1){
                    System.out.println(name + ", age: " + age + " years");
                } else { 
                    System.out.println(name + ", age: " + age + " year");
                }
            }
            
        } catch (Exception e){ 
            
        }

    }
}
