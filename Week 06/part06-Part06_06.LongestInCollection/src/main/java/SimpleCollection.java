
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
    
    public String longest(){
        if (this.elements.isEmpty()){
            return null;
        } else { 
            int aux = 0; 
            for (String iterator: elements){ 
                if(iterator.length() > aux){ 
                    aux = iterator.length();
                }
            }
            
            for (String iterator: elements){ 
                if(iterator.length() == aux){ 
                    return iterator;
                }
            }
            
            return "xxxxxx";
            
        }
    }

}
