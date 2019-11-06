package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    public void register(User user);

    public List<User> selectAll(Integer page,Integer rows);

    public void update(User user);

    public void delete(String id);

    public Integer selectCount();

    public List<User> select();
}
