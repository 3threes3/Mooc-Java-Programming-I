
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = this.totalWeight();
        if (totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.size() == 0){
            return "no items (0 kg)";
        }
        if (this.items.size() == 1){
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        int totalWeight = 0;
        for (Item iterator : items) {
            totalWeight += iterator.getWeight();
        }
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
    
    public void printItems() { 
        for(Item iterator: items){
            System.out.println(iterator);
        }
    }
    
    public int totalWeight() { 
        int totalWeight = 0;
        for (Item iterator : items) {
            totalWeight += iterator.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem (){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item iterator: this.items){ 
            if(iterator.getWeight() > heaviest.getWeight()){
                heaviest = iterator;
            }
        }
        return heaviest;
    }
    
    

}
