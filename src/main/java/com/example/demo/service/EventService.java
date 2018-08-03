package com.example.demo.service;

import com.example.demo.model.Event;

public interface EventService {

	Event getEvent(String guid, int uid);
}
