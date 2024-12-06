package com.training.eventservice.model;

import com.training.eventservice.Entity.Category;
import com.training.eventservice.Entity.EventStatus;
import com.training.eventservice.model.CategoryModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventModel {
    private Long id;
    private String name;
    private String description;
    private Instant startDateTime;
    private Instant endDateTime;
    private Long venueId;
    private Long organizerId;
    private EventStatus eventStatus;
    private Set<CategoryModel> categories;
}