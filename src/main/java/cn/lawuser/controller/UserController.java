package cn.lawuser.controller;

import cn.lawuser.model.AjaxResult;
import cn.lawuser.util.MD5Util;
import cn.lawuser.entity.UserEntity;
import cn.lawuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Generated;
import javax.servlet.http.HttpSession;

/**
 * @author nozomi
 * @date 2018/9/14 21:52
 * @description
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 注册
     * @param userEntity
     * @return
     */
    @PostMapping("register")
    public AjaxResult userRegister(UserEntity userEntity){
        String newPwd=MD5Util.MD5Encode(userEntity.getPassword(),"UTF-8");
        userEntity.setPassword(newPwd);
        userEntity.setRegisTime(System.currentTimeMillis());
        userService.register(userEntity);
        return  new AjaxResult(HttpStatus.OK,"注册成功");
    }

    /**
     * 登录
     * @param userEntity
     * @return
     */
    @PostMapping("login")
    public AjaxResult userLogin(UserEntity userEntity, HttpSession session){
        String newPwd=MD5Util.MD5Encode((userEntity.getPassword()),"UTF-8");
        userEntity.setPassword(newPwd);
        UserEntity user=userService.login(userEntity);
        if (user!=null){
            if(user.getPayTime()+7776000>System.currentTimeMillis()){
               user.setPay(true);
            }
            else {
                user.setPay(false);
            }
            session.setAttribute("user",user);
            return new AjaxResult(HttpStatus.OK,"登陆成功",user);
        }
        return new AjaxResult(HttpStatus.OK,"信息有误");

    }

    @GetMapping("getPass")
    public boolean getpass(HttpSession session){
        UserEntity userEntity= (UserEntity) session.getAttribute("user");
        return userEntity.isPay();
    }

}
