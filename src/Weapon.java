public enum Weapon {
    WEAPON("sword");

    private String value;

    Weapon(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
