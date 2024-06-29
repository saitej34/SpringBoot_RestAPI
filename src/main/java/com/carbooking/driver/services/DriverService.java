package com.carbooking.driver.services;

import com.carbooking.driver.Dao.DriverDao;
import com.carbooking.driver.models.APIResponse;
import com.carbooking.driver.models.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    DriverDao driverDao;

    @Autowired
    public DriverService(DriverDao driverDao) {
        this.driverDao = driverDao;
    }

    public ResponseEntity<APIResponse> createDriver(Driver driver) {
        System.out.println(driver.toString());
        try {
            driverDao.save(driver);
            return new ResponseEntity<>(new APIResponse("Success","Driver Created"), HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(new APIResponse("Failed","Driver Failed to create"),HttpStatus.BAD_REQUEST);
        }
    }
}
