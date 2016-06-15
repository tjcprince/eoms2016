package com.boco.eoms.sheet.commontask.dao;

import com.boco.eoms.sheet.commontask.module.CommonTaskMain;
import java.util.List;

public interface CommonTaskMainMapper {
    public static final String DATA_SOURCE_NAME = "db1";

    int deleteByPrimaryKey(String id);

    int insert(CommonTaskMain record);

    int insertSelective(CommonTaskMain record);

    CommonTaskMain selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommonTaskMain record);

    int updateByPrimaryKey(CommonTaskMain record);

    int insertBatch(List<CommonTaskMain> records);
}