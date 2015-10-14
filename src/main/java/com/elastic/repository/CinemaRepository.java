package com.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elastic.entity.Cinema;


/**
 * 影院搜索操作接口
 * @author chuanyinhu
 *
 */
public interface CinemaRepository extends ElasticsearchRepository<Cinema, Long> {

	/**
	 * 根据影院id搜索文档
	 * @param cinemaId
	 * @return
	 */
	Cinema findByCinemaId(Long cinemaId);
	
	
}
