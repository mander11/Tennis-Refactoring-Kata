
public class Security {
    private String name; //Apple
    private int shareNum; //50
    private double sharePrice;  //$1

    public Security(String name, int shareNum, double sharePrice) {
        this.name = name;
        this.shareNum = shareNum;
        this.sharePrice = sharePrice;
    }

    public double marketValue() {
        return shareNum * sharePrice;
    }

}