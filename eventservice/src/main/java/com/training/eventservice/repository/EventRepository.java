package com.training.eventservice.repository;

import com.training.eventservice.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long>  {
}
