
import java.util.Scanner;
public class UserInterface {
    
    private TodoList list;
    private Scanner sc;
    
    public UserInterface (TodoList list, Scanner sc){
        this.list = list; 
        this.sc = sc;
    }
    
    public void start(){
        while (true){ 
            System.out.print("Command: ");
            String command = this.sc.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.print("To add: ");
                String task = this.sc.nextLine();
                this.list.add(task);
            }
            if(command.equals("list")){
                this.list.print();
            }
            if(command.equals("remove")){
                System.out.print("Which one is removed?");
                int index = Integer.valueOf(this.sc.nextLine());
                this.list.remove(index);
            }
            
        }
    }

}
