package Shape;

public class circle extends Shape {
    double radius;
    double pi = Math.PI;
    public circle(float radius, String color){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return pi*(radius*radius);
    }
    @Override
    public String toString(){
        return "Circle radius: "+radius+"circle radius: "+color;
    }
}