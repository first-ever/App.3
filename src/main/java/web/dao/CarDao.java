package web.dao;

import web.car.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(int count);
}
