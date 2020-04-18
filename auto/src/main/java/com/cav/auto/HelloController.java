//package com.example.springboot;
package com.cav.auto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.cav.auto.Car;

@Controller
public class HelloController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/new-car")
    public String new_car(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        Car test = new Car(name);
        String modelName = test.model;
        if (test.dadsFave(test)){
            modelName = "Dad's Fave";
        }
        model.addAttribute("modelName", modelName);
        return "car";
    }

}