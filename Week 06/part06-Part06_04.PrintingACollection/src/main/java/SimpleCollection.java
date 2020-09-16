
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() { 
        if(this.elements.isEmpty()){ 
            return "The collection " + this.name + " is empty."; 
        } else if (this.elements.size() == 1){ 
            String aux = "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
            return aux;
        } else { 
            String aux2 = "The collection " + this.name + " has " + this.elements.size() + " elements:\n"; 
            for (String iterator: this.elements){
                aux2 = aux2 + iterator + "\n";
            }
            return aux2;
        }
    }
    
}
