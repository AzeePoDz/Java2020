package Ball;

public class ball {
    private String type;
    private float diameter;
    public ball (String type, float diametr){
        this.type = type;
        this.diameter = diameter;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setDiameter(float diameter){
        this.diameter = diameter;
    }
    public float getDiameter(){
        return diameter;
    }
    @Override
    public String toString(){
        return this.type+", diametr"+this.diameter;
    }
    public void printBall(){
        System.out.println(type);
        System.out.println(diameter);
    }

}
