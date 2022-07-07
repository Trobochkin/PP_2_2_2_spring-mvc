package web.model;

public class Car {
    private String model;
    private int weight;
    private int year;

    public Car() {
    }

    public Car(String model, int weight, int year) {
        this.model = model;
        this.weight = weight;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
