package generics;

public class Fruit {

    private String name;
    private String countryOfOrigin;
    private String color;
    private Double weight;

    public Fruit(String name, String countryOfOrigin, String color, Double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
