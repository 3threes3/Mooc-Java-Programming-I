
public class Item {
    private String identifier; 
    private String name; 
    
    public Item (String identifier, String name){ 
        this.identifier = identifier; 
        this.name = name; 
    }
    
    @Override
    public boolean equals (Object compared){ 
        if(this == compared) { 
            return true;
        }
        
        if (!(compared instanceof Item)){
            return false; 
        }
        
        Item newOne = (Item) compared;
        
        if(this.identifier.equals(newOne.identifier)){
            return true;
        } else { 
            return false;
        }
    }
    
    @Override
    public String toString () { 
        return this.identifier + ": " + this.name;
    }

}
