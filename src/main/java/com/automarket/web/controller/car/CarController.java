package com.automarket.web.controller.car;

import com.automarket.service.car.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;


}
