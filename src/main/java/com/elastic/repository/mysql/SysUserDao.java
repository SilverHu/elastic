package com.elastic.repository.mysql;

import com.elastic.entity.mysql.SysUser;

public interface SysUserDao extends MysqlBaseRepository<SysUser, Long> {

	SysUser findByUsername(String user);

}
