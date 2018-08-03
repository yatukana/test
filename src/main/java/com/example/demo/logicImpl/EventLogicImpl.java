package com.example.demo.logicImpl;

import org.springframework.stereotype.Component;

import com.example.demo.logic.EventLogic;
import com.example.demo.model.Event;
@Component
public class EventLogicImpl implements EventLogic {

	@Override
	public Event getEvent(String guid, int uid) {
		// TODO 自動生成されたメソッド・スタブ
		Event event = new Event();
		event.setGuid("guidは" + guid + ",uidは");
		event.setUid(uid);
		return event;
	}

}
