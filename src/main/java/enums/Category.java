package enums;

public enum Category {

    NECKLACES("Necklaces"),
    EARRINGS("Earrings"),
    RINGS("Rings"),
    BRACELETS("Bracelets"),
    ACCESSORIES("Accessories"),
    ONE_OF_A_KIND("One of a Kind"),
    GIFTING("Gifting");


    private String Category;

    Category(String category) { Category = category; }

    public String getCategory() {return Category;}
}
