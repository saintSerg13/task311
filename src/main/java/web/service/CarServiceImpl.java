package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {




    @Override
    public List<Car> getCar(int count) {
        List<Car> listCar = new ArrayList<>();

            listCar.add(new Car("color1", "model1", "cost1"));
            listCar.add(new Car("color2", "model2", "cost2"));
            listCar.add(new Car("color3", "model3", "cost3"));
            listCar.add(new Car("color4", "model4", "cost4"));
            listCar.add(new Car("color5", "model5", "cost5"));

        if(count >= listCar.size())
            return listCar;
        else return listCar.stream().limit(count).collect(Collectors.toList());

    }
}
