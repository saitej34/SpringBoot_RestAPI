package com.carbooking.driver.controllers;

import com.carbooking.driver.models.APIResponse;
import com.carbooking.driver.models.AttachementEntity;
import com.carbooking.driver.models.Driver;
import com.carbooking.driver.services.DriverService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("driver")
public class DriverController {

    DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping("create")
    public ResponseEntity<APIResponse> createDriver(@RequestBody Driver driver){
        return driverService.createDriver(driver);
    }

    @GetMapping("getDrivers")
    public ResponseEntity<List<Driver>> getAllDrivers(@RequestParam Boolean attachedToCar){
        return driverService.getAllDrivers(attachedToCar);
    }

    @PostMapping("/attach/{driverId}/{carId}")
    public ResponseEntity<APIResponse> attachDrivertoCar(@PathVariable("driverId") Integer driverId, @PathVariable("carId") Integer carId){
        return driverService.attachDrivertoCar(driverId,carId);
    }



}
