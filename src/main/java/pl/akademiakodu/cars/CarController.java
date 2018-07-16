package pl.akademiakodu.cars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CarController {

    @GetMapping ("/")
    public String addCar(){
        return "add";
    }


    @GetMapping ("/add")
    public String show(@ModelAttribute
                       Car car, ModelMap modelMap) {
        modelMap.put("car", car);
        return "show";
    }

    @GetMapping("/all")
    public String all (ModelMap modelMap) {
        modelMap.put("cars", Car.findAll());
        return "all";
    }





}
