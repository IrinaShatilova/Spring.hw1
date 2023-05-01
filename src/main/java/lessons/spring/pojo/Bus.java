package lessons.spring.pojo;

public class Bus extends Transport{
    public Bus(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return "автобус " + super.toString();
    }
}
