package enums.Filters;

public enum Price {
    BELOW_1000("Below £1,000.00"),
    BETWEEN_1000_2000("£1,000.00 - £2,000.00"),
    BETWEEN_2000_3000("£2,000.00 - £3,000.00"),
    BETWEEN_3000_4000("£3,000.00 - £4,000.00"),
    BETWEEN_4000_5000("£4,000.00 - £5,000.00"),
    BETWEEN_5000_6000("£5,000.00 - £6,000.00"),
    BETWEEN_6000_7000("£6,000.00 - £7,000.00"),
    BETWEEN_7000_8000("£7,000.00 - £8,000.00"),
    BETWEEN_8000_9000("£8,000.00 - £9,000.00"),
    ABOVE_9000("£9,000.00 and above");


    private String Price;

    public String getPrice() { return Price; }

    Price(String price) { Price = price; }
}
