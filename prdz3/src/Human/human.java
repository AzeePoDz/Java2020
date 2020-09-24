package Human;

public class human {
        private head head;
        private leg leg;
        private hand hand;
        public human(head head, leg leg, hand hand){
            this.head = head;
            this.leg = leg;
            this.hand = hand;
        }
        @Override
    public String toString(){
            return "Head: "+head+", leg:"+leg+", hand:"+hand;
        }
}
