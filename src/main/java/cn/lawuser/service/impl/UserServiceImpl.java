package cn.lawuser.service.impl;

import cn.lawuser.dao.UserDao;
import cn.lawuser.entity.UserEntity;
import cn.lawuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nozomi
 * @date 2018/9/14 23:04
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserEntity findByName(String userName){
        return userDao.findByName(userName);
    }

    @Override
    public void register(UserEntity userEntity){
         userDao.addUser(userEntity);
    }

    @Override
    public UserEntity login(UserEntity userEntity){return userDao.userLogin(userEntity);}

}
