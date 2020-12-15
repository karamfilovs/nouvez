package enums;

public enum Designers {
    ANTONINI("Antonini"),
    DAUPHIN("Dauphin"),
    ELIZABETH_GAGE("Elizabeth Gage"),
    LOQUET_LONDON("Loquet London"),
    MAISON_ALUCERT("Maison Auclert"),
    PASQUALE_BRUNI("Pasquale Bruni"),
    PIPPA_SMALL("Pippa Small"),
    RAPHAELE_CANOT("Raphaele Canot"),
    THEO_FENNELL("Theo Fennell");


    private String Designers;

    public String getDesigners() { return Designers; }

    Designers(String designers) { Designers = designers; }
}
