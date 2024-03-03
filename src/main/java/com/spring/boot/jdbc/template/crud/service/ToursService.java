package com.spring.boot.jdbc.template.crud.service;

import com.spring.boot.jdbc.template.crud.model.Tour;

import java.util.List;

public interface ToursService {
    public List<Tour> getAllTours();

    public Tour getById(int id);

    public Tour save(Tour tour);

    public Tour updateTour(Tour tour);

    public String deleteUser(int id);
}
