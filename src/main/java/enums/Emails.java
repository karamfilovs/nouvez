package enums;

public enum Emails {

    PLAIN_STRING ("pragmatic"),
    MULTIPLE_DOTS ("email.pragmatic.bg"),
    MULTIPLE_AT ("email@example@pragmatic.bg"),
    DOT_IN_THE_BEGINNING(".email@pragmatic.bg"),
    DOT_IN_THE_USERNAME ("email.@pragmatic.bg"),
    COPY_PASTED("Joe Smith <email@pragmatic.bg>"),
    NO_USERNAME("@pragmatic.bg"),
    SPECIAL_CHARS("#@%^%#$@#$@#.com"),
    NO_TOP_LEVEL_DOMAIN("email@example");

    private Emails(String emails) { this.emails = emails; }

    public String getEmails() { return emails; }

    private String emails;


}
