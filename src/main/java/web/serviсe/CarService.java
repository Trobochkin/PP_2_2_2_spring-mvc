package web.servi�e;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> listOfCar(List<Car> cars, int count);
}
