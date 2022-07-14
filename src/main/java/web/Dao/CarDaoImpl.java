package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl {
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("wv", 1200, 1998));
        carList.add(new Car("lada", 1200, 1984));
        carList.add(new Car("tesla", 1200, 2020));
        carList.add(new Car("dodge", 1200, 2005));
        carList.add(new Car("toyota", 1200, 2008));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
