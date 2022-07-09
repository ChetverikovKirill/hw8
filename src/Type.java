public enum Type {

    FOOD("Еда"),
    CLOTHES("Одежда"),
    OTHER("Прочее");

    String type;

    Type(String type) {
        this.type = type;
    }

    static Type getByType(String type) {
        for (Type buy : values()) {
            if (buy.getType().equalsIgnoreCase(type)) {
                return buy;
            }
        }
        return OTHER;
    }

    public String getType() {
        return type;
    }
}