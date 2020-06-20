package enums.Filters;

public enum Designer {
    ANTONINI("Antonini"),
    DAUPHIN("Dauphin"),
    ELIZABETH_GAGE("Elizabeth Gage"),
    LOQUET("Loquet"),
    MAISON_AUCLERT("Maison Auclert"),
    PASQUALE_BRUNI("Pasquale Bruni"),
    PIPPA_SMALL("Pippa Small"),
    RAPHAELE_CANOT("Raphaele Canot"),
    THEO_FENNELL("Theo Fennell");


    private String Designer;

    public String getDesigner() { return Designer; }

    Designer(String designer) { Designer = designer; }
}
