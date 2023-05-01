package lessons.spring.pojo;

public class Pickup extends Transport{
    public Pickup(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return "пикап " + super.toString();
    }
}
