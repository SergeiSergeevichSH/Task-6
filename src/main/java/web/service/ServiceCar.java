package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCar {
    private List<Car> cars;

    public List<Car> getShowCars() {
        return cars;
    }

    {
        cars = List.of(
                new Car("Жигуль", "Жёлтый", 1981),
                new Car("Нива", "Красный", 1995),
                new Car("Волга", "чёрный", 2000),
                new Car("Лада", "Вишнёвый", 2005),
                new Car("Москвич", "Зелёный", 1985));
    }

    public List<Car> getShowCars(int count) {
        List<Car> carSC = new ArrayList<>(cars);
        return cars.stream()
                .limit(Math.min(count, carSC.size()))
                .collect(Collectors.toList());
    }
}
