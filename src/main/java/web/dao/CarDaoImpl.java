package web.dao;

import org.springframework.stereotype.Component;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private static final List<Car> list = new ArrayList<>();

    static {
        list.add(new Car("bmw", "blue", 200));
        list.add(new Car("mercedes", "green", 180));
        list.add(new Car("range rover", "white", 150));
        list.add(new Car("rolls royce", "rose", 185));
        list.add(new Car("mclaren", "blue", 250));
        list.add(new Car("subaru", "silver", 130));
    }

    public List<Car> getList() {
        return list;
    }
}
