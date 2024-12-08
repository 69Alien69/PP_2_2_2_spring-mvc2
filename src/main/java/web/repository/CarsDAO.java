package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public interface CarsDAO {
    List<Car> getCars();
}
