
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals (Object compared) { 
        if (this == compared) { 
            return true;
        }
        
        if (!(compared instanceof Book)){ 
            return false;
        }
        
        Book newone = (Book) compared;
        
        if(this.name.equals(newone.name) && this.publicationYear == newone.publicationYear){
            return true;
        } else { 
            return false; 
        }
    }

}
