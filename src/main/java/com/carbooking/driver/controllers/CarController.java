package com.carbooking.driver.controllers;


import com.carbooking.driver.models.APIResponse;
import com.carbooking.driver.models.AttachementEntity;
import com.carbooking.driver.models.Car;
import com.carbooking.driver.models.CarWrapper;
import com.carbooking.driver.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/addCar")
    public ResponseEntity<APIResponse> createCar(@RequestBody CarWrapper car){
        return carService.createCar(car);
    }

    @GetMapping("/getCars")
    public ResponseEntity<List<Car>>  getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("getAllCars")
    public ResponseEntity<List<AttachementEntity>> getCarDriverAttachmentDetails(@RequestParam Boolean attached){
        return carService.getCarDriverAttachmentDetails(attached);
    }
}
