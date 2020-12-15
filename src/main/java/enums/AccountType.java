package enums;

public enum AccountType {
    PERSONAL("Particulier"),
    BUSINESS("Bedrijf");

    private String type;

    AccountType(String type) {
        this.type = type; }

    public String getAccountType() { return type; }
}
