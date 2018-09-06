package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.logic.EventLogic;
import com.example.demo.model.Event;
import com.example.demo.service.EventService;

@Component
public class EventServiceImpl implements EventService {

	@Autowired
	EventLogic eventLogic;

	@Override
	public List<Event> getEvents() {
		// TODO 自動生成されたメソッド・スタブ
		return eventLogic.getEvents();
	}

}
