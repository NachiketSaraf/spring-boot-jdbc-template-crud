package com.spring.boot.jdbc.template.crud.dbutiles;

public class DBConstants {
    public static final String GET_ALL_TOURS = "SELECT * FROM tours";
    public static final String GET_TOUR_BY_ID = "SELECT * FROM tours WHERE id=?";
    public static final String INSERT_TOUR = "INSERT INTO tours"
            +" (id, name, duration, max_group_size, rating, price, summary, images, secret_tour, start_dates, duration_weeks)"
            +" values(?,?,?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_USER_BY_ID = "UPDATE tours SET name=?, duration=?, " +
            "max_group_size=?, rating=?, price=?, summary=?, images=?, secret_tour=?, start_dates=?," +
            " duration_weeks=? WHERE id=?";
    public static final String DELETE_TOUR_BY_ID ="DELETE FROM tours WHERE id=?";


}
