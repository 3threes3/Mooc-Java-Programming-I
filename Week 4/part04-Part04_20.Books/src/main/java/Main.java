import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> library = new ArrayList ();
        
        String title; 
        int pages; 
        int year; 
        
        while(true){
            System.out.print("Title: ");
            title = scanner.nextLine();
            if(!title.isEmpty()){
                System.out.print("Pages: ");
                pages = Integer.valueOf(scanner.nextLine()); 
                System.out.print("Publication year: ");
                year = Integer.valueOf(scanner.nextLine()); 
                library.add(new Book(title, pages, year));
            } else {
                break;
            }
        }
        
        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();
        if(info.equalsIgnoreCase("everything")){
            for(Book iterator: library){
                System.out.println(iterator);
            }
        } else if (info.equalsIgnoreCase("name")){
            for(Book iterator: library){
                System.out.println(iterator.justTitle());
            }
        }

    }
}
