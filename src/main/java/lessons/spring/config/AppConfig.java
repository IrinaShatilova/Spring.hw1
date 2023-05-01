package lessons.spring.config;

import lessons.spring.pojo.Bus;
import lessons.spring.pojo.Car;
import lessons.spring.pojo.Driver;
import lessons.spring.pojo.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Audi А8");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Volvo 7900");
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("Ford F150");
    }

    @Bean(name = "driverCar")
    public Driver getDriverCar() {
        return new Driver("Алексей Алексеев", getCarBean());
    }

    @Bean(name = "driverBus")
    public Driver getDriverBus() {
        return new Driver("Иван Иванов", getBusBean());
    }

    @Bean(name = "driverPickup")
    public Driver getDriverPickup() {
        return new Driver("Андрей Андреев", getPickupBean());
    }
}
