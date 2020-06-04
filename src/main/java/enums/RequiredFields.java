package enums;

public enum RequiredFields {

    FIRSTNAME("") ,
    LASTNAME(""),
    EMAIL(""),
    PASSWORD(""),
    CONFIRMPASSWORD("");


    private RequiredFields(String requiredFields) {
        RequiredFields = requiredFields;
    }

    public String getRequiredFields() {
        return RequiredFields;
    }

    private String RequiredFields;
}
