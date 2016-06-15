package com.boco.eoms.jdbc;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcUtil extends JdbcDaoSupport{
	/**
	 * 把jdbcTemplate注入进去
	 * @param jb
	 */
	@Resource
	public void setJb(JdbcTemplate jb) {
	 super.setJdbcTemplate(jb);
	}
	
	public List<Map<String, Object>> queryList (String sql) {
		return this.getJdbcTemplate().queryForList(sql);
	}
}
