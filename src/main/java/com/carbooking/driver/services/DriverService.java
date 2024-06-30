package com.carbooking.driver.services;

import com.carbooking.driver.Dao.CarDao;
import com.carbooking.driver.Dao.DriverDao;
import com.carbooking.driver.models.APIResponse;
import com.carbooking.driver.models.AttachementEntity;
import com.carbooking.driver.models.Driver;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverService {

    private Integer attachmentStatus = 0;

    @Autowired
    DriverDao driverDao;

    @Autowired
    CarDao carDao;



    public ResponseEntity<APIResponse> createDriver(Driver driver) {
        try {
            driverDao.save(driver);
            return new ResponseEntity<>(new APIResponse("Success","Driver Created"), HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(new APIResponse("Failed","Driver Failed to create"),HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<List<Driver>> getAllDrivers(Boolean attachedToCar) {
        try{
            if(attachedToCar){
                List<Driver> drivers = driverDao.findDriverbyAttachedList(attachmentStatus);
                return new ResponseEntity<>(drivers,HttpStatus.OK);
            } else {
                List<Driver> drivers = driverDao.findDriverbyNotAttached(attachmentStatus);
                return new ResponseEntity<>(drivers,HttpStatus.OK);
            }
        } catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    public ResponseEntity<APIResponse> attachDrivertoCar(Integer driverId, Integer carId) {
        try{
             System.out.println(driverDao.findDriverById(driverId));
             System.out.println(carDao.findCarById(carId));
            if(driverDao.findDriverById(driverId).isEmpty()){
                return new ResponseEntity<>(new APIResponse("Failed","Invalid Driver Id"),HttpStatus.NOT_FOUND);
            }
            if(carDao.findCarById(carId).isEmpty()) {
                return new ResponseEntity<>(new APIResponse("Failed", "Invalid Car Id"), HttpStatus.NOT_FOUND);
            }
            driverDao.makeAttachment(carId,driverId);
            return new ResponseEntity<>(new APIResponse("Success","Driver"),HttpStatus.OK);
        } catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new APIResponse("Failed","Internal Server Error"),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
