package com.luckydog.controller;

import com.alibaba.fastjson.JSONObject;
import com.luckydog.bean.TblUserRecord;
import com.luckydog.returnJson.ReturnObject;
import com.luckydog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2020/7/14 22:17
 */

@RestController
public class LoginController {

/*    @RequestMapping("/auth/login")
    public String test() {
        System.out.println("test");
        return "";
    }*/
    @Autowired
    private LoginService loginService;

    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("login");
        TblUserRecord tblUserRecord = loginService.login(username, password);
//        System.out.println(tblUserRecord);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }
}
