package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarsDAOListImpl implements CarsDAO {
    private static final Car CAR_1 = new Car("Lada", "Priora", "XTA98743985");
    private static final Car CAR_2 = new Car("Tesla", "Cybertruck", "SHT40293852");
    private static final Car CAR_3 = new Car("Audi", "Rs6", "BST293487534");
    private static final Car CAR_4 = new Car("Nefaz", "5299-40-57", "AAAAVT08U5");
    private static final Car CAR_5 = new Car("GAZelle", "Next", "MRS564735675");
    private static final List<Car> CARS = Arrays.asList(CAR_1, CAR_2, CAR_3, CAR_4, CAR_5);

    public List<Car> getCars() {
        return List.copyOf(CARS);
    }
}
