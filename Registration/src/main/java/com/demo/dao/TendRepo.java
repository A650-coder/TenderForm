package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Tender;

public interface TendRepo extends JpaRepository<Tender, Integer>{

}
