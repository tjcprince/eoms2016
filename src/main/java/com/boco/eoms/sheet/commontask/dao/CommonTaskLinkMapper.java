package com.boco.eoms.sheet.commontask.dao;

import com.boco.eoms.sheet.commontask.module.CommonTaskLink;
import java.util.List;

public interface CommonTaskLinkMapper {
    public static final String DATA_SOURCE_NAME = "db1";

    int deleteByPrimaryKey(String id);

    int insert(CommonTaskLink record);

    int insertSelective(CommonTaskLink record);

    CommonTaskLink selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommonTaskLink record);

    int updateByPrimaryKey(CommonTaskLink record);

    int insertBatch(List<CommonTaskLink> records);
}