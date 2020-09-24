package Shape;

public class ShapeTest {
    public static void main(String[] args){
        circle c = new circle(32, "blue");
        rectangle r = new rectangle(51, 43, "red");
        square sq = new square(12, "pink");
        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(sq.toString());
    }

}
