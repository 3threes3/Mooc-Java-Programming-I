
public class Bird {
    
    private String name; 
    private String latinName; 
    private int timesSeen;
    
    public Bird(){
        
    }
    
    public Bird (String name, String latinName){ 
        this.name = name; 
        this.latinName = latinName; 
    }
    
    public String getName(){ 
        return this.name;
    }
    
    public void setTimesSeen(int times){
        this.timesSeen = times;
    }
    
    public int getTimesSeen (){
        return this.timesSeen;
    }
    
    public String getLatinName(){ 
        return this.latinName;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.timesSeen + " observations";
    }

}
