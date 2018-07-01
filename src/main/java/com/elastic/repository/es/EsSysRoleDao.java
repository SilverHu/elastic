package com.elastic.repository.es;

import com.elastic.entity.es.EsSysRole;

public interface EsSysRoleDao extends EsBaseRepository<EsSysRole, Long> {
	public EsSysRole findByName(String name);
}
