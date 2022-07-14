package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDaoImpl;
import web.model.Car;
import web.serviñe.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarService carservice;
    private CarDaoImpl carDao;

    @Autowired
    public CarController(CarService carservice, CarDaoImpl carDao) {
        this.carservice = carservice;
        this.carDao = carDao;
    }

    @GetMapping(value = "/Car")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = carDao.getCarList();
        cars = carservice.listOfCar(cars, count);
        model.addAttribute("cars", cars);
        return "Car";
    }
}
