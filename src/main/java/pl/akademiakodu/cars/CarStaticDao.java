package pl.akademiakodu.cars;

import java.util.ArrayList;
import java.util.List;

public class CarStaticDao implements CarDao {

    private static List<Car> cars = new ArrayList<>();


    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);  }
}
