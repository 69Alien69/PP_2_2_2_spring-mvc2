package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarsDAO;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarsDAO carsDAO;

    private CarServiceImpl(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    public List<Car> getCars(int count) {
        List<Car> cars = carsDAO.getCars();
        if (cars.size() >= count) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
