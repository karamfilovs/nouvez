package enums.Filters;

public enum Diamonds {
    WHITE_DIAMOND("White Diamond"),
    COLOURED("Coloured");


    private String Diamonds;

    public String getDiamonds() { return Diamonds; }

    Diamonds(String diamonds) { Diamonds = diamonds; }
}
