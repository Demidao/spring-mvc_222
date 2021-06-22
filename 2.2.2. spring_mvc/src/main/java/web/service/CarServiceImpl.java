package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int number) {
        List<Car> out = new ArrayList<>();
        if (number <= 0) {
            return out;
        }

        if (number <= Car.getCarList().size()) {
            for (int i = 0; i < number; i++) {
                out.add(Car.getCarList().get(i));
            }
            return out;
        } else {
            return Car.getCarList();
        }
    }
}
