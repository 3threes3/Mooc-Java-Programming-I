
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() { 
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() { 
        ArrayList <String> list = new ArrayList<>(); 
        for(Exercise iterator: this.exercises){
            list.add(iterator.getName());
        }
        return list;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise (exercise));
    }
    
    public void markAsCompleted(String exercise){
        for(Exercise iterator: this.exercises){
            if(iterator.getName().equals(exercise)){
                iterator.setCompleted(true);
            }
        }        
    }
    
    public boolean isCompleted(String exercise){
        for(Exercise iterator: this.exercises){ 
            if(iterator.getName().equals(exercise)){
                return iterator.isCompleted();
            }
        }
        return false;
    }

}
