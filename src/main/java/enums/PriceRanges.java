package enums;

public enum PriceRanges {
    Below£2000 ("Below £2,000"),
    £2000to£5000("£2,000 to £5,000"),
    £5000to£10000("£5,000 to £10,000"),
    Above£10000("Above £10,000");

    public String getPriceRanges() { return PriceRanges; }

    PriceRanges(String priceRanges) { PriceRanges = priceRanges; }

    private String PriceRanges;
}
