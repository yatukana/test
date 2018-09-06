package com.example.demo.dao;

import com.example.demo.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDao extends JpaRepository <EventEntity, Integer>{

}