package cn.lawuser.dao;

import cn.lawuser.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author nozomi
 * @date 2018/9/14 21:52
 * @description
 */
@Repository
public interface UserDao {
    /**
     * 根据用户名查找
     * @param userName
     * @return
     */
    UserEntity findByName(String userName);
    /**
     * 注册用户
     * @param userEntity
     */
   void addUser(UserEntity userEntity);

    /**
     * 用户登录
     * @param userEntity
     * @return
     */
   UserEntity userLogin(UserEntity userEntity);

}
