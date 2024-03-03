package com.spring.boot.jdbc.template.crud.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tour {
    private int id;
    private String name;
    private int duration;
    private int max_group_size;
    private double rating;
    private double price;
    private String summary;
    private String images;
    private Boolean secretTour;
    private Date startDates;
    private int durationWeeks;




}
