
import java.util.ArrayList;


public class Hold {
    
    private ArrayList<Suitcase> luggage;
    private int maxWeight;
    
    public Hold (int maxWeight){ 
        
        this.luggage = new ArrayList<>();
        this.maxWeight = maxWeight;
         
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int total = 0;
        
        for (Suitcase iterator: luggage){
            total += iterator.totalWeight();
        }
        
        if (total + suitcase.totalWeight() <= this.maxWeight){ 
            this.luggage.add(suitcase);
        }
        
    }
    
    @Override
    public String toString(){
        int total = 0;
        
        for (Suitcase iterator: this.luggage){
            total += iterator.totalWeight();
        }
        return this.luggage.size() + " suitcases (" + total + " kg)";
    }
    
    public void printItems(){
        for (Suitcase iterator: this.luggage){
            iterator.printItems();
        }
    }

}
