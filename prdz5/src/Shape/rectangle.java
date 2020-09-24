package Shape;

public class rectangle extends Shape {
    double width;
    double length;
    public rectangle (double wight, double length, String color){
        super(color);
        this.width = wight;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    public double getPerimetr(){
        return width+length;
    }
    @Override
    public String toString(){
        return "Rectangle width: "+width+", rectangle length"+length+", rectangle color: "+color;
    }
}
