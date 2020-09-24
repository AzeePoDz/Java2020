package Human;

public class head {
    private String EyesColor;
    private String HairType;
    public head (String ec, String ht){
        EyesColor = ec;
        HairType = ht;
    }
    public void setEyesColor(){
        this.EyesColor = EyesColor;
    }
    public void setHairType(){
        this.HairType = HairType;
    }
    public String getEyesColor(){
        return EyesColor;
    }
    public String getHairType(){
        return HairType;
    }
    @Override
    public String toString(){
        return EyesColor+""+HairType+"";
    }
}
