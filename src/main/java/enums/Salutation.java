package enums;

public enum Salutation {
    NOT_SPECIFIED("Not specified"),
    MRS("Mrs."),
    MR("Mr.");

    private String salutationType;

    Salutation(String salutationType) { this.salutationType = salutationType; }

    public String getSalutationType() { return salutationType; }
}
