
public class Book {
    
    private String title; 
    private int pages; 
    private int year; 
    
    public Book (String titleIN, int pagesIN, int yearIN){ 
        this.title = titleIN; 
        this.pages = pagesIN; 
        this.year = yearIN; 
    }
    
    public String justTitle() { 
        return this.title;
    }
    
    
    @Override
    public String toString(){
        return (this.title + ", " + this.pages + " pages, " + this.year);
    }

}
