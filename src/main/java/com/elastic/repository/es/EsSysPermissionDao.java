package com.elastic.repository.es;

import java.util.List;

import com.elastic.entity.es.EsSysPermission;

public interface EsSysPermissionDao extends EsBaseRepository<EsSysPermission, Long> {

	/**
	 * 查询顶级菜单（倒叙）
	 * 
	 * @return
	 */
	public List<EsSysPermission> findByParentidIsNullOrderByWeightDesc();

	/**
	 * 根据类型查询菜单
	 * 
	 * @param type
	 * @return
	 */
	public List<EsSysPermission> findByType(Byte type);

	public EsSysPermission findByPermission(String permission);
}
