package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.car.Car;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        if (count < 5) {
            return carDao.getList().stream().limit(count).collect(Collectors.toList());
        } else {
            return carDao.getList();
        }
    }

}
