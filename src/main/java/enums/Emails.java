package enums;

public enum Emails {

    PLAINSTRING ("pragmatic"),
    MULTIPLEDOTS ("email.pragmatic.bg"),
    MULTIPLEAT ("email@example@pragmatic.bg"),
    DOTINTHEBEGINNING(".email@pragmatic.bg"),
    DOTINTHEUSERNAME ("email.@pragmatic.bg"),
    COPYPASTED("Joe Smith <email@pragmatic.bg>"),
    NOUSERNAME("@pragmatic.bg"),
    SPECIALCHARS("#@%^%#$@#$@#.com"),
    NOTOPLEVELDOMAIN("email@example");

    private Emails(String emails) { this.emails = emails; }

    public String getEmails() { return emails; }

    private String emails;


}
