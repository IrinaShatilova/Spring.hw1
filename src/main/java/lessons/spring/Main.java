package lessons.spring;

import lessons.spring.config.AppConfig;
import lessons.spring.pojo.Bus;
import lessons.spring.pojo.Car;
import lessons.spring.pojo.Driver;
import lessons.spring.pojo.Pickup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean("car", Car.class);
        Bus bus = context.getBean("bus", Bus.class);
        Pickup pickup = context.getBean("pickup", Pickup.class);
        System.out.println(car + " готов к работе");
        System.out.println(bus + " готов к работе");
        System.out.println(pickup + " готов к работе");
        System.out.println("-------------------------------");
        Driver driverCar = context.getBean("driverCar", Driver.class);
        Driver driverBus = context.getBean("driverBus", Driver.class);
        Driver driverPickup = context.getBean("driverPickup", Driver.class);
        System.out.println(driverCar);
        System.out.println(driverBus);
        System.out.println(driverPickup);
        context.close();
    }
}
