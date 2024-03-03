package com.spring.boot.jdbc.template.crud.repository;

import com.spring.boot.jdbc.template.crud.model.Tour;

import java.util.List;

public interface ToursRepository {
    public List<Tour> getAllTours();
    public Tour getById(int id);
    public Tour save(Tour tour);
    public Tour updateTour(Tour tour);
    public String deleteUser(int id);
}
