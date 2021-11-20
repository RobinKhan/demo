package com.learnjpa.springboot.controllers;

import java.util.List;

import com.learnjpa.springboot.entites.City;
import com.learnjpa.springboot.servieces.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jpav1")
public class HomeController {


    @Autowired
    CityService cityService;

    @GetMapping("/hello")
    public String helloString() {

        return "this is 1st";
        
    }

    @GetMapping("/cities")
    public List<City> GetCityAll(){

        return cityService.getAllCity();
    }

    @PostMapping("/newcity")
    public City NewCity(@RequestBody  City city){

        return cityService.newCity(city);
    }

    @DeleteMapping("/removecity/{id}")
    public  String RemovedCity(@PathVariable("id") int id){
        return  cityService.removeCity(id);

    }

    
}
