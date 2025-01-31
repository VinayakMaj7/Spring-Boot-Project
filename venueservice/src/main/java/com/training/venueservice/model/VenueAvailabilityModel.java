package com.training.venueservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueAvailabilityModel {
    private Long id;
    private Long venueId;
    private Instant startDateTime;
    private Instant endDateTime;
}
