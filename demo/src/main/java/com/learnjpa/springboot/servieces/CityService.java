package com.learnjpa.springboot.servieces;

import java.util.List;

import com.learnjpa.springboot.entites.City;
import com.learnjpa.springboot.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    

    @Autowired CityRepository cityRepository;


    City city;

    public List<City> getAllCity(){

        return cityRepository.findAll();
    }

    public City newCity(City city){

        return cityRepository.save(city);
    }

    public String removeCity(int id){

        cityRepository.deleteById(id);

        return "This City has been remove"+id;
    }


}
