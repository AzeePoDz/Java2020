package Dog;
import java.lang.*;
public class dogtest {
    public static void main(String[] args){
        dog d1 = new dog ("Bobik", 4);
        dog d2 = new dog ("Sharik", 3);
        dog d3 = new dog ("Pes", 5);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

    }

}
