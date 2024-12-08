package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarsDAOListImpl implements CarsDAO {
    private static final Car car1 = new Car("Lada", "Priora", "XTA98743985");
    private static final Car car2 = new Car("Tesla", "Cybertruck", "SHT40293852");
    private static final Car car3 = new Car("Audi", "Rs6", "BST293487534");
    private static final Car car4 = new Car("Nefaz", "5299-40-57", "AAAAVT08U5");
    private static final Car car5 = new Car("GAZelle", "Next", "MRS564735675");
    private static final List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);

    public List<Car> getCars() {
        return List.copyOf(cars);
    }
}
