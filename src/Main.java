
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW");
        try {
            Car car = myCar.clone();
            car.start();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        myCar.start();
    }
}

interface Engine {

    default void start() {
        System.out.println("Engine starting...");
    }
}

interface Battery {
    default void start() {
        System.out.println("Battery starting...");
    }
}

class Car implements Battery, Cloneable {
    private String model;
    private int serialNumber;
    private static int number = 1;

    Car(String model) {
        this.model = model;
        this.serialNumber = number;
        number++;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        Battery.super.start();
        System.out.printf("%s (#%d) started successfully.\n", model, serialNumber);
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.serialNumber = number;
        number++;
        return car;
    }
}
