package com.elastic.entity.es;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "sys_role")
public class EsSysRole {

	private Long id;// 角色id

	private String name;// 角色名称

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
