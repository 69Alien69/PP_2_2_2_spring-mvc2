package web.model;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String vin;

    public Car(String brand, String model, String vin) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, vin);
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", vin='" + vin + '\'' + '}';
    }
}
