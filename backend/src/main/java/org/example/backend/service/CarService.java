package org.example.backend.service;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Car;
import org.example.backend.model.CarDTO;
import org.example.backend.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository repo;
    public List<Car> GetAllCars(){return repo.findAll();}
    public Car saveCar(CarDTO carDTO){
        return repo.save(new Car(null, carDTO.name(), carDTO.producer(), carDTO.countOfDoors(),
                carDTO.price(), carDTO.colour(), carDTO.yearOfBuild(), carDTO.drivenKilometer()));
    }
    public Car getCarByID(String id){
        return repo.findById(id).orElseThrow();
    }
    public void deleteCarById(String id){
        repo.deleteById(id);
    }
    public Car updateCar(String id, CarDTO carDTO){
        Car car = getCarByID(id);
        car.setName(carDTO.name());
        car.setProducer(carDTO.producer());
        car.setCountOfDoors(carDTO.countOfDoors());
        car.setPrice(carDTO.price());
        car.setColour(carDTO.colour());
        car.setYearOfBuild(carDTO.yearOfBuild());
        car.setDrivenKilometer(carDTO.drivenKilometer());
        return repo.save(car);
    }
}
