package three.encapsulation;

class Car {
    String brand;
    String color;
    int speed;

    public Car() {
    }

    public  Car(String brand, String color, int speed) {
        System.out.println("Constructor of Car");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        if(speed < 0) {
            return 0;
        }
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Red",100);
        car1.drive();

        Car car2 = new Car("Kia","White",120);


    }
}