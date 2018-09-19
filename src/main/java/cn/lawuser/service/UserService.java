package cn.lawuser.service;

import cn.lawuser.entity.UserEntity;

/**
 * @author nozomi
 * @date 2018/9/14 23:04
 * @description
 */
public interface UserService {
    /**
     * 根据用户名查找
     * @param userName
     * @return
     */
    UserEntity findByName(String userName);
    /**
     * 用户注册
     * @param userEntity
     */
   void register(UserEntity userEntity);

    /**
     * 用户登录
     * @param userEntity
     */
   UserEntity login(UserEntity userEntity);
}
