package chapter9;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(String flavor, double price, int tiers) {
        super(flavor, price);
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    @Override
    public void printCakeDetails() {
        System.out.println("Wedding Cake: \nFlavor -> " + getFlavor() +
                "\nTiers -> " + tiers + "\nPrice -> $" + getPrice());
    }
}
