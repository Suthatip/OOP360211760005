package lab8;
//1. color - String
//2. Brand - String
//3. carID - String
//4. Engine (has-a relation)

public class Car {
    private String color;
    private String brand;
    private String carId;
    private Engine engine;

    public Car(){}

    public Car(String color, String brand, String carId, Engine engine) {
        this.color = color;
        this.brand = brand;
        this.carId = carId;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", carId='" + carId + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}//class
