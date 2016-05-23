package com.boco.eoms.tawSystemUser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boco.eoms.tawSystemUser.dao.TawSystemUserMapper;
import com.boco.eoms.tawSystemUser.module.TawSystemUser;

@Service("tawSystemUserService")
public class TawSystemUserServiceImpl implements TawSystemUserServiceI {
	@Autowired
	private TawSystemUserMapper tawSystemUserMapper;

	@Override
	public TawSystemUser selectByPrimaryKey(String id) {

		return tawSystemUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(TawSystemUser record) {

		return tawSystemUserMapper.insert(record);
	}

	@Override
	public TawSystemUser selectByUserid(String userid) {
		return tawSystemUserMapper.selectByUserid(userid);
	}

}
