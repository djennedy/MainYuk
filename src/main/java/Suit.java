// Enum to represent card suits
public enum Suit {
    DIAMOND(0),
    CLOVER(1),
    HEART(2),
    SPADE(3);

    // Each suit is given a value to be used for comparison
    public final int val;

    Suit(int val)
    {
        this.val=val;
    }
}
