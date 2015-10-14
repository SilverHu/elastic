package com.elastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elastic.entity.Cinema;
import com.elastic.service.CinemaService;
import com.elastic.util.WebUtils;

@Controller("cinema")
public class CinemaController {

	@Autowired
	private CinemaService cinemaService;

	@RequestMapping(value = "/saveCinema", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Object saveCinema(Cinema cinema) {
		cinemaService.save(cinema);
		return WebUtils.SUCCESS;
	}

	@RequestMapping(value = "/findAllCinema", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Object findAllCinema() {
		return cinemaService.findAll();
	}
}
