package lessons.spring.pojo;

public class Car extends Transport {
    public Car(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return "легковой автомобиль " + super.toString();
    }
}
