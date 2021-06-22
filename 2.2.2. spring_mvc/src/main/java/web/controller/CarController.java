package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("cars")
    public String getMyCars(@RequestParam(value = "count", required = false) int count,
                            Model model) {

        List<Car> carListByCount = new CarServiceImpl().getCars(count);

        model.addAttribute("carListByCount", carListByCount);
        model.addAttribute("car", new Car());
        return "cars";
    }

}
