
import java.util.ArrayList;
public class TodoList {
    
    private ArrayList<String> stuff;
    
    public TodoList () { 
        
        this.stuff = new ArrayList<>();
        
    }
    
    public void add(String task){
        this.stuff.add(task);
    }
    
    public void print(){
        for (int i = 0; i < this.stuff.size(); i++){
            System.out.println((i+1) + ": " + this.stuff.get(i));
        }
    }
    
    public void remove(int number){
        this.stuff.remove(number - 1);
    }

}
