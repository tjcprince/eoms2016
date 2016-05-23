package com.boco.eoms.tawSystemUser.dao;

import com.boco.eoms.tawSystemUser.module.TawSystemUser;
import java.util.List;

public interface TawSystemUserMapper {
    public static final String DATA_SOURCE_NAME = "db1";

    int deleteByPrimaryKey(String id);

    int insert(TawSystemUser record);

    int insertSelective(TawSystemUser record);

    TawSystemUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TawSystemUser record);

    int updateByPrimaryKey(TawSystemUser record);

    int insertBatch(List<TawSystemUser> records);

	TawSystemUser selectByUserid(String userid);
}