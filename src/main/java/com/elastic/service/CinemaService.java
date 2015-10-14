package com.elastic.service;

import java.util.List;

import com.elastic.entity.Cinema;

/**
 * 影院服务
 * @author chuanyinhu
 *
 */
public interface CinemaService {
	
	/**
	 * 新增或更新影院文档
	 * @param cinema
	 */
	public void save(Cinema cinema);
	
	/**
	 * 查询所有影院文档
	 * @return
	 */
	public List<Cinema> findAll();
}
