package chapter14;

import java.util.Random;

public class Coin {

    protected static final String HEADS = "heads";
    protected static final String TAILS = "tails";
    private String side;

    public String flip() {
        if (new Random().nextBoolean()) {
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }
        return getSide();
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
