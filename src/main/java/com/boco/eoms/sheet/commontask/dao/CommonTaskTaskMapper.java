package com.boco.eoms.sheet.commontask.dao;

import com.boco.eoms.sheet.commontask.module.CommonTaskTask;
import java.util.List;

public interface CommonTaskTaskMapper {
    public static final String DATA_SOURCE_NAME = "db1";

    int deleteByPrimaryKey(String id);

    int insert(CommonTaskTask record);

    int insertSelective(CommonTaskTask record);

    CommonTaskTask selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommonTaskTask record);

    int updateByPrimaryKey(CommonTaskTask record);

    int insertBatch(List<CommonTaskTask> records);
}