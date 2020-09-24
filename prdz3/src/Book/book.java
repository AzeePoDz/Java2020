package Book;

public class book {
    private String author;
    private String title;
    private int year;
    public book (String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public void setAuthor(){
        this.author = author;
    }
    public void setTitle(){
        this.title = title;
    }
    public void setYear(){
        this.year = year;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    @Override
    public String toString(){
        return "Author: "+author+", title: "+title+year;
    }
}
