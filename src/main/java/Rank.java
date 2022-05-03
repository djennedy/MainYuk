// Enum to represent card rank
public enum Rank {
    THREE(0),
    FOUR(1),
    FIVE(2),
    SIX(3),
    SEVEN(4),
    EIGHT(5),
    NINE(6),
    TEN(7),
    JACK(8),
    QUEEN(9),
    KING(10),
    ACE(11),
    TWO(12);

    // Each rank is given a value to be used for comparison
    private final int val;

    Rank(int val)
    {
        this.val=val;
    }
}
