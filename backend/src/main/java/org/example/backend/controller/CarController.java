package org.example.backend.controller;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Car;
import org.example.backend.model.CarDTO;
import org.example.backend.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    @GetMapping
    public List<Car> getAllCars(){
        return carService.GetAllCars();
    }
    @GetMapping("/{id}")
    public Car getCarById(@ PathVariable String id){
        return carService.getCarByID(id);
    }
    //private CarService
    @PostMapping
    public ResponseEntity<Car> saveNewCar(@RequestBody CarDTO carDTO){
        Car newCar = carService.saveCar(carDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCar);
    }

    @PutMapping("/{id}")
    public Car updateCarById(@PathVariable String id, @RequestBody CarDTO carDTO){
        return carService.updateCar(id, carDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable String id){
        carService.deleteCarById(id);
    }
}
