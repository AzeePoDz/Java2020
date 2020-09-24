package Human;

public class leg {
    private int LegLength;
    private int LegWidth;
    public leg (int ll, int lw){
        LegLength = ll;
        LegWidth = lw;
    }
    public void setLegLength(int LegLength){
        this.LegLength = LegLength;
    }
    public void setLegWidth(){
        this.LegWidth = LegWidth;
    }
    public int getLegLength(){
        return LegLength;
    }
    public int getLegWidth(int LegWidth){
        return LegWidth;
    }
    @Override
    public String toString(){
        return "Leg length: "+LegLength+", leg wight: "+LegWidth;
    }
}
