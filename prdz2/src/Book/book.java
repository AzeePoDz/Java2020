package Book;

public class book {
    private String name;
    private String author;
    private double cost;
    public book (String n, String a, double c){
        name = n;
        author = a;
        cost = c;
    }
    public void setName(){
        this.name = name;
    }
    public void setAuthor(){
        this.author = author;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }

    public double getCost() {
        return cost;
    }
    @Override
    public String toString(){
        return this.name+", author"+this.author+", cost"+this.cost;
    }
}
