package com.luckydog.service;

import com.luckydog.bean.TblUserRecord;
import com.luckydog.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2020/7/15 23:27
 */

@Service
public class LoginService {

    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;

    public TblUserRecord login(String username, String password) {
        return tblUserRecordMapper.login(username, password);
    }
}
