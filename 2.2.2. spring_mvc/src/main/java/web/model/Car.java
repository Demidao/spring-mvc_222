package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String color;

    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW", "x6", "yellow"));
        carList.add(new Car("Mercedes-Benz", "SL500", "black"));
        carList.add(new Car("Tesla", "ModelS", "silver blue"));
        carList.add(new Car("Chevrolet", "Tahoe", "red"));
        carList.add(new Car("Cadillac", "Escalade", "white"));
    }

    public Car() {}

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static List<Car> getCarList() {
        return carList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
