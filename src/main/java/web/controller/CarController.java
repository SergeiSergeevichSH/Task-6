package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.ServiceCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class CarController {
    private ServiceCar serviceCar;

    public CarController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;

    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer a, ModelMap model) {
        List<Car> messages;
        if (a != null && a > serviceCar.getShowCars().size()) {
            messages = new ArrayList<>(serviceCar.getShowCars(serviceCar.getShowCars().size()));
        } else
            messages = new ArrayList<>(serviceCar.getShowCars(Objects.requireNonNullElse(a,serviceCar.getShowCars().size())));
        model.addAttribute("messages", messages);
        return "cars";
    }
}

