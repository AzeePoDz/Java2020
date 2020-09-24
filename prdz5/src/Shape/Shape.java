package Shape;

 public abstract class Shape {
    protected String color;
    public abstract double getArea();
    public Shape(String color){
        this.color = color;
    }
    public void setColor(){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
