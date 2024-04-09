package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
