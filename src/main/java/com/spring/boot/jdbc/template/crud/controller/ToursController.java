package com.spring.boot.jdbc.template.crud.controller;

import com.spring.boot.jdbc.template.crud.model.Tour;
import com.spring.boot.jdbc.template.crud.service.ToursService;
import com.spring.boot.jdbc.template.crud.service.ToursServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ToursController {
    @Autowired
    ToursService toursService;
    @Operation(summary = "To get all available tours")
    @GetMapping("all")
    public List<Tour> getAllTours(){
        return toursService.getAllTours();
    }
    @Operation(summary = "To get tour by id")
    @GetMapping("tour/{id}")
    public Tour getTourById(@PathVariable int id){
        return toursService.getById(id);
    }
    @Operation(summary = "To create a tour")
    @PostMapping("tour")
    public Tour createTour(@RequestBody Tour tour){
        return toursService.save(tour);
    }
    @Operation(summary = "To update an existing tour")
    @PutMapping("tour")
    public Tour updateTour(@RequestBody Tour tour){
        return toursService.updateTour(tour);
    }
    @Operation(summary = "To delete a tour by id")
    @DeleteMapping("tour/{id}")
    public String deleteTour(@PathVariable int id){
        return toursService.deleteUser(id);
    }
}
