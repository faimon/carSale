package store;

import model.car.Car;
import model.car.Engine;
import model.car.User;

public class HmnMain {
    public static void main(String[] args) {
//        Engine engine = new Engine(249, 3.0f, "Бензиновый");
//        User user = new User("apk", "123", "555222");
//        HbmStore.instanceOf().saveUser(user);
//        Car car = new Car("Toyota", "white", 400000,
//                2005, 100000, "Седан", "Автоматическая",
//                "Полный", engine, user);
//        HbmStore.instanceOf().saveCar(car, engine);
      //  System.out.println(HbmStore.instanceOf().findAllCars());
        System.out.println(HbmStore.instanceOf().findCarById(2));
    }
}