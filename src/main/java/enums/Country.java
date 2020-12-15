package enums;

public enum Country {

    NETHERLANDS("Netherlands"),
    BELGIUM("Belgium");


    private String country;

    private Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
