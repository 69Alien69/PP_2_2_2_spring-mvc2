package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.repository.CarsList;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCarsList(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = CarsList.getCars();
        if(cars.size() >= count) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
