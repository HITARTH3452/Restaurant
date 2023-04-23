package com.geekster.Restaurant.controller;

import com.geekster.Restaurant.model.restaurant;
import com.geekster.Restaurant.service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restaurantController {

    @Autowired
    restaurantService restrotservice;

    @GetMapping(value = "/getrestro/{id}")
    public List<restaurant> getRestById(@PathVariable String id){return restrotservice.getRestroBasedOnId(id);}

    @GetMapping(value = "/getRestro")
    public List<restaurant> getAllRestro(){return restrotservice.getAllRestro();}

    @PostMapping(value = "/addrestro")
    public String addrestro(@RequestBody restaurant restro){return restrotservice.addmyRestro(restro);}

    @PutMapping(value = "/updateRestroBySpeciality/{id}/{speciality}")
    public String updateRestroBySpeciality(@PathVariable String id, @PathVariable String speciality){
        return restrotservice.updateSpecialityById(id,speciality);
    }

    @DeleteMapping(value = "/deleteRestroById/{id}")
    public String deleterestrobyId(@PathVariable String id){return restrotservice.removeRestaurantById(id);}
}
