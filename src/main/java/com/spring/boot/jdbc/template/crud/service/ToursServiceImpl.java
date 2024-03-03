package com.spring.boot.jdbc.template.crud.service;

import com.spring.boot.jdbc.template.crud.model.Tour;
import com.spring.boot.jdbc.template.crud.repository.ToursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToursServiceImpl implements ToursService{
    @Autowired
    ToursRepository toursRepository;

    @Override
    public List<Tour> getAllTours() {
        return toursRepository.getAllTours();
    }

    @Override
    public Tour getById(int id) {
        return toursRepository.getById(id);
    }

    @Override
    public Tour save(Tour tour) {
        return toursRepository.save(tour);
    }

    @Override
    public Tour updateTour(Tour tour) {
        return toursRepository.updateTour(tour);
    }

    @Override
    public String deleteUser(int id) {
        return toursRepository.deleteUser(id);
    }
}
