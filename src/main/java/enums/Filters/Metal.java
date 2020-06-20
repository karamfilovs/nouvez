package enums.Filters;

public enum Metal {
    BLACK_GOLD("Black Gold"),
    BLUE_RHODIUM("Blue Rhodium"),
    ROSE_GOLD("Rose Gold"),
    WHITE_GOLD("White Gold"),
    YELLOW_GOLD("Yellow Gold"),
    RED_GOLD("Red Gold");

    Metal(String metal) { Metal = metal; }

    public String getMetal() { return Metal; }

    private String Metal;
}
