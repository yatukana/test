package com.example.demo.logic;

import java.util.List;

import com.example.demo.entity.EventEntity;
import com.example.demo.model.Event;

public interface EventLogic {

	Event createEvent(String guid, int uid);
	
	List<Event> getEvents();
}
