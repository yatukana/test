package com.example.demo.logicImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.EventDao;
import com.example.demo.entity.EventEntity;
import com.example.demo.logic.EventLogic;
import com.example.demo.model.Event;

@Component
public class EventLogicImpl implements EventLogic {

	@Autowired
	private EventDao eventDao;

	@RequestMapping(method = RequestMethod.GET)
	@Transactional
	@Override
	public List<Event> getEvents() {
		List<EventEntity> eventEntityList = eventDao.findAll();
		System.out.println("eventEntityList:"+ eventEntityList);
		List<Event> returnEventList = new ArrayList<>();
		for (EventEntity list : eventEntityList) {
			Event event = new Event();
			event.setUid(list.getUid());
			event.setGuid(list.getGuid());
			returnEventList.add(event);
		}
		return returnEventList;
	}
	
	

	@Override
	public Event createEvent(String guid, int uid) {
		// TODO 自動生成されたメソッド・スタブ
		Event event = new Event();
		event.setGuid("guidは" + guid + ",uidは");
		event.setUid(uid);
		return event;
	}

}
