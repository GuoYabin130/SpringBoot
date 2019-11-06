package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        user.setPosition("普通用户");
        user.setStatus("激活");
        userDAO.save(user);
    }

    @Override
    public List<User> selectAll(Integer page,Integer rows) {
        List<User> users = userDAO.selectAll(page,rows);
        return users;
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void delete(String id) {
        userDAO.delete(id);
    }

    @Override
    public Integer selectCount() {
        Integer integer = userDAO.selectCount();
        return integer;
    }

    @Override
    public List<User> select() {
        List<User> select = userDAO.select();
        return select;
    }

}
