package Human;

public class humanTest {
    public static void main (String[] args){
        head head = new head("Blue", "long");
        leg leg = new leg(90, 23);
        hand hand = new hand(50, 10);
        human human = new human(head, leg, hand);
        System.out.println(human);

    }
}
