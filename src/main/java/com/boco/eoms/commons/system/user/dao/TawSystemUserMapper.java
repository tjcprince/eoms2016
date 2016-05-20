package com.boco.eoms.commons.system.user.dao;

import java.util.List;

import com.boco.eoms.commons.system.user.module.TawSystemUser;

public interface TawSystemUserMapper {
    public static final String DATA_SOURCE_NAME = "db1";

    int deleteByPrimaryKey(String id);

    int insert(TawSystemUser record);

    int insertSelective(TawSystemUser record);

    TawSystemUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TawSystemUser record);

    int updateByPrimaryKey(TawSystemUser record);

    int insertBatch(List<TawSystemUser> records);
}