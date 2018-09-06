package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class EventEntity {
	 
	    @Id
	    @Column(name="uid")
	    private Integer uid;
	 
	    @Column(name="guid")
	    private String guid;

		public Integer getUid() {
			return uid;
		}

		public String getGuid() {
			return guid;
		}

		public void setUid(Integer uid) {
			this.uid = uid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}
	 
}
