package com.training.eventservice.service;

import com.training.eventservice.model.EventModel;
import java.util.List;
public interface EventService {
    EventModel createEvent(EventModel eventModel);

    EventModel getEvent(Long eventId);

    List<EventModel> getAllEvents();

    EventModel updateEvent(Long eventId, EventModel eventModel);

    String deleteEvent(Long eventId);
}
