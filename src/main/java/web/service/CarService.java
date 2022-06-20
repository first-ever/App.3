package web.service;

import web.car.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}
