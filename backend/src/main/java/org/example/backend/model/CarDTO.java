package org.example.backend.model;

public record CarDTO(String name, String producer, double countOfDoors,
                     double price,String colour, double yearOfBuild,double drivenKilometer) {
}
