package com.spring.boot.jdbc.template.crud.repository;

import com.spring.boot.jdbc.template.crud.dbutiles.DBConstants;
import com.spring.boot.jdbc.template.crud.model.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToursRepositoryImpl implements ToursRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Tour> getAllTours() {
        return jdbcTemplate.query(DBConstants.GET_ALL_TOURS, (rs, rowNum) -> {
            return new Tour(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("duration"),
                    rs.getInt("max_group_size"),
                    rs.getDouble("rating"),
                    rs.getDouble("price"),
                    rs.getString("summary"),
                    rs.getString("images"),
                    rs.getBoolean("secret_tour"),
                    rs.getDate("start_dates"),
                    rs.getInt("duration_weeks"));
        });
    }

    @Override
    public Tour getById(int id) {
        return jdbcTemplate.queryForObject(DBConstants.GET_TOUR_BY_ID, (rs, rowNum) -> {
            return new Tour(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("duration"),
                    rs.getInt("max_group_size"),
                    rs.getDouble("rating"),
                    rs.getDouble("price"),
                    rs.getString("summary"),
                    rs.getString("images"),
                    rs.getBoolean("secret_tour"),
                    rs.getDate("start_dates"),
                    rs.getInt("duration_weeks"));
        },id);
    }

    @Override
    public Tour save(Tour tour) {
        jdbcTemplate.update(DBConstants.INSERT_TOUR,
                tour.getId(),
                tour.getName(),
                tour.getDuration(),
                tour.getMax_group_size(),
                tour.getRating(),
                tour.getPrice(),
                tour.getSummary(),
                tour.getImages(),
                tour.getSecretTour(),
                tour.getStartDates(),
                tour.getDurationWeeks());
        return tour;
    }

    @Override
    public Tour updateTour(Tour tour) {
        jdbcTemplate.update(DBConstants.UPDATE_USER_BY_ID,
                tour.getName(),
                tour.getDuration(),
                tour.getMax_group_size(),
                tour.getRating(),
                tour.getPrice(),
                tour.getSummary(),
                tour.getImages(),
                tour.getSecretTour(),
                tour.getStartDates(),
                tour.getDurationWeeks(),
                tour.getId());
        return tour;
    }

    @Override
    public String deleteUser(int id) {
        jdbcTemplate.update(DBConstants.DELETE_TOUR_BY_ID,id);
        return "Tour delete with id: " + id;
    }

}
