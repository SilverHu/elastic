package com.elastic.repository.mysql;

import com.elastic.entity.mysql.SysRole;

public interface SysRoleDao extends MysqlBaseRepository<SysRole, Long> {
	public SysRole findByName(String name);
}
