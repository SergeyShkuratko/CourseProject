package entity;

public enum LanguageLevel {
    NATIVE("native"),
    INTERMEDIATE("intermediate");

    private String value;

    LanguageLevel(String value) {
        this.value = value;
    }
}
