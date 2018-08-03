package com.example.demo.serviceImpl;

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
	public Event getEvent(String guid, int uid) {
		// TODO 自動生成されたメソッド・スタブ
		return eventLogic.getEvent(guid, uid);
	}

}
