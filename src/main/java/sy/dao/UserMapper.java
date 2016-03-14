package sy.dao;

import java.util.List;
import sy.module.User;

public interface UserMapper {
    public static final String DATA_SOURCE_NAME = "db6";

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);
    
    User selectByEmail(String email);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int insertBatch(List<User> records);
}