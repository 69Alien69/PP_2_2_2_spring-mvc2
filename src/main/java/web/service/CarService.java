package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.repository.CarsDAO;

import java.util.List;

@Component
public class CarService {

    private final CarsDAO carsDAO;

    private CarService(CarsDAO carsDAO) {
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
