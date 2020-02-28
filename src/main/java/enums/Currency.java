package enums;

public enum Currency {

    EU("EU");
    GBP("GBP");

    private String currency;

    private Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
