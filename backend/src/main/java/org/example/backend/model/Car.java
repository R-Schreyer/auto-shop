package org.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@AllArgsConstructor
@Builder
public class Car {
    private String id;
    private String name;
    private String producer;
    private double countOfDoors;
    private double price;
    private String colour;
    private double yearOfBuild;
    private double drivenKilometer;

}
