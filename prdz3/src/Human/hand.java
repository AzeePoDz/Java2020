package Human;

public class hand {
    private int HandLength;
    private int HandWidth;
    public hand (int hl, int hw){
        HandLength = hl;
        HandWidth = hw;
    }
    public void setHandLength(int HandLength){
        this.HandLength = HandLength;
    }
    public void setHandWidth(int HandWidth){
        this.HandWidth = HandWidth;
    }
    @Override
    public String toString(){
        return "Hand Length: "+HandLength+", hand width"+HandWidth;
    }
}
