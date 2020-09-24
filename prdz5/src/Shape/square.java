package Shape;

public class square extends Shape {
    double side;
    boolean filled;
    public square(double side, String color){
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public boolean isFilled() {
        return filled;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    public double getPerimetr(){
        return side*4;
    }
    @Override
    public String toString(){
        return "Square side: "+side+"square color: "+color;
    }
}