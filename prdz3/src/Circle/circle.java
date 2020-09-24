package Circle;

public class circle {
    float radius;
    public circle(float r){
        radius = r;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    public float getDiameter(){
        return radius * 2;
    }
    public void circle(){
        System.out.println("Radius: " +radius+" Diametr: "+getDiameter());
    }
}

