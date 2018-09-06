package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	EventService eventService;
//
//	@RequestMapping(value = { "/" })
//	public String getEvent(@RequestParam("guid") String guid, @RequestParam("uid") int uid) {

	@RequestMapping(value = { "/events" })
	public List<Event> getEvent() {	
		List<Event> eventList = eventService.getEvents();
		
		return eventList;

	}

}
