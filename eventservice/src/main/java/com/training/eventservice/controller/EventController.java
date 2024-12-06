package com.training.eventservice.controller;

import com.training.eventservice.model.APIResponse;
import com.training.eventservice.model.EventModel;
import com.training.eventservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<APIResponse> createEvent(@RequestBody EventModel eventModel){
        EventModel eventModel1 = eventService.createEvent(eventModel);
        return new ResponseEntity<APIResponse>(new APIResponse(true, "Event Created Successfully", eventModel1), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<APIResponse> getEvent(@PathVariable("eventId") Long eventId){
        EventModel eventModel1 = eventService.getEvent(eventId);
        return new ResponseEntity<APIResponse>(new APIResponse(true, "Event Fetched Successfully", eventModel1), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<APIResponse> getAllEvents(){
        List<EventModel> events = eventService.getAllEvents();
        return new ResponseEntity<APIResponse>(new APIResponse(true, "All Events Fetched Successfully", events), HttpStatus.OK);
    }
    @PostMapping("/{eventId}")
    public ResponseEntity<APIResponse> updateEvent(@PathVariable("eventId") long eventId, @RequestBody EventModel eventModel){
        EventModel updateEvent =  eventService.updateEvent(eventId, eventModel);
        return new ResponseEntity<>(new APIResponse(true, "Event updated Successfully", updateEvent), HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<APIResponse> getEvent(@PathVariable("eventId") long eventId){
        String deleteMessage = eventService.deleteEvent(eventId);
        return new ResponseEntity<>(new APIResponse(true, "Event deleted Successfully", deleteMessage), HttpStatus.OK);
    }
}
