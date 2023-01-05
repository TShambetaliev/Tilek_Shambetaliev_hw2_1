public class Transport {
    private String model;
    private int year;
    private ColorEnum color;

    public Transport(String model, int year, ColorEnum color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public ColorEnum getColor() {
        return color;
    }
}
