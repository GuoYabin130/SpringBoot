package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    //插入
    public void save(User user);
    //查询
    public List<User> selectAll(@Param("page") Integer page, @Param("rows") Integer rows);
    //查询所有的用户个数
    public Integer selectCount();

    public void update(User user);

    public void delete(String id);

    public void deleteByids(String[] ids);

    public List<User> select();
}
