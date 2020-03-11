package enums;

public enum Country {

    ALBANIA("Albania"),
    ARUBA("Aruba");

    private String country;

    private Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
