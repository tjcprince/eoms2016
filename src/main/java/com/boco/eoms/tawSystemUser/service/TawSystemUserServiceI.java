package com.boco.eoms.tawSystemUser.service;

import com.boco.eoms.tawSystemUser.module.TawSystemUser;

public interface TawSystemUserServiceI {
	public TawSystemUser selectByPrimaryKey(String id);

	public int insert(TawSystemUser record);

	public TawSystemUser selectByUserid(String userid);
}
