package com.elastic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elastic.entity.Cinema;
import com.elastic.service.CinemaService;
import com.elastic.util.WebUtils;

@Controller
@RequestMapping("/cinema")
public class CinemaController {

	@Autowired
	private CinemaService cinemaService;

	@RequestMapping("/saveCinema")
	@ResponseBody
	public Object saveCinema(Cinema cinema,double lon,double lat) {
		cinema.getPoint().reset(lat, lon);
		
		System.out.println(cinema.toString());
		cinemaService.save(cinema);
		return WebUtils.SUCCESS;
	}

	@RequestMapping("/findAllCinema")
	@ResponseBody
	public Object findAllCinema() {
		List<Cinema> cinemaLi = cinemaService.findAll();
		return cinemaLi;
	}
}
