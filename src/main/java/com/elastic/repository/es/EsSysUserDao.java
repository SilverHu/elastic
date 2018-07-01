package com.elastic.repository.es;

import com.elastic.entity.es.EsSysUser;

public interface EsSysUserDao extends EsBaseRepository<EsSysUser, Long> {

	EsSysUser findByUsername(String user);

}
