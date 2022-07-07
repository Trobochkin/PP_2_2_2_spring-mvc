package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.serviñe.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carservice;

    @GetMapping(value = "/Car")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("wv", 1200, 1998));
        cars.add(new Car("lada", 1200, 1984));
        cars.add(new Car("tesla", 1200, 2020));
        cars.add(new Car("dodge", 1200, 2005));
        cars.add(new Car("toyota", 1200, 2008));
        cars = carservice.listOfCar(cars, count);
        model.addAttribute("cars", cars);
        return "Car";
    }
}
