package com.automarket.web.controller.car;

import com.automarket.data.dto.car.CarDto;
import com.automarket.service.car.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @GetMapping("/{id}")
    public String getCar(@PathVariable Long id, Model model) {
        CarDto car = carService.findById(id);
        model.addAttribute("car", car);
        return "car";
    }

    @GetMapping("/getAll")
    public String getCars(Model model) {
        List<CarDto> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/create")
    public String createCarForm() {
        return "createCarForm";
    }

    @PostMapping("/create")
    public String createCar(@ModelAttribute CarDto dto) {
        CarDto carDto = carService.create(dto);
        return "redirect:/cars/" + carDto.getId();
    }

    @GetMapping("/edit/{id}")
    public String editCarForm(@PathVariable("id") Long id, Model model) {
        CarDto car = carService.findById(id);
        model.addAttribute("car", car);
        return "editCarForm";
    }

    @PostMapping("/edit/{id}")
    public String editCar(@ModelAttribute CarDto dto) {
        carService.update(dto);
        return "redirect:/cars/" + dto.getId();
    }

    @PostMapping("/delete/{id}")
    public String deleteCarForm(@PathVariable("id") Long id) {
        carService.delete(id);
        return "redirect:/cars/getAll";
    }
}
