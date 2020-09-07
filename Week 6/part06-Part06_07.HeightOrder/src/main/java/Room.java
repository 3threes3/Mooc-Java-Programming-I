
import java.util.ArrayList;


public class Room {
    
    private ArrayList<Person> people; 
    
    public Room () { 
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){ 
        this.people.add(person);
    }
    
    public boolean isEmpty(){ 
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){ 
        return this.people;
    }
    
    public Person shortest(){ 
        if(this.isEmpty()){
            return null;
        }
        Person shortOne = this.people.get(0);
        for (Person iterator: people){ 
            if(iterator.getHeight() < shortOne.getHeight()){
                shortOne = iterator;
            }
        }
        return shortOne;
    }
    
    public Person take(){
        Person weakestLink = this.shortest();
        this.people.remove(this.shortest());
        return weakestLink;
    }
    
    
    
    
    
    

}
