package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> listCar = new ArrayList<>();


    {
        listCar.add(new Car("color1", "model1", "cost1"));
        listCar.add(new Car("color2", "model2", "cost2"));
        listCar.add(new Car("color3", "model3", "cost3"));
        listCar.add(new Car("color4", "model4", "cost4"));
        listCar.add(new Car("color5", "model5", "cost5"));
    }


    @Override
    public List<Car> readCar(int n) {
        if(n>=5)
            n = 5;
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newListCar.add(listCar.get(i));
        }
        return newListCar;
    }
}
