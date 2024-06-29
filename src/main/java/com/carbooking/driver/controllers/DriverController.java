package com.carbooking.driver.controllers;

import com.carbooking.driver.models.APIResponse;
import com.carbooking.driver.models.Driver;
import com.carbooking.driver.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
