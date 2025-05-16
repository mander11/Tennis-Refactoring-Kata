
public class Security {
    private String name; //Apple
    private int shareNum; //50
    private double sharePrice;  //$1
    private double desiredPercentage; //target %allocation

    public Security(String name, int shareNum, double sharePrice, double desiredPercentage) {
        this.name = name;
        this.shareNum = shareNum;
        this.sharePrice = sharePrice;
        this.desiredPercentage = desiredPercentage;
    }

    public double marketValue() {
        return shareNum * sharePrice;
    }

}