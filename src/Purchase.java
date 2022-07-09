public class Purchase {

    private String name;
    private double price;
    private Type type;

    Purchase(String name, double price, Type type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    Purchase() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override

    public String toString() {
        return String.format("Название : " + name + " Цена = " + price + " Тип : " + type.getType());
    }
}
