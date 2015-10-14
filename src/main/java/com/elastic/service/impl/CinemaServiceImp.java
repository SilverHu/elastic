package com.elastic.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elastic.entity.Cinema;
import com.elastic.repository.CinemaRepository;
import com.elastic.service.CinemaService;

@Service
public class CinemaServiceImp implements CinemaService{

	@Autowired
	private CinemaRepository cinemaRepository;

	@Override
	public void save(Cinema cinema) {
		cinemaRepository.save(cinema);
	}

	@Override
	public List<Cinema> findAll() {
		List<Cinema> cinemaList = new ArrayList<>();
		
		Iterable<Cinema> cinemaItable = cinemaRepository.findAll();
		Iterator<Cinema> cinemaIts = cinemaItable.iterator();
		while (cinemaIts.hasNext()) {
			cinemaList.add(cinemaIts.next());
		}
		
		return cinemaList;
	}
	
}
