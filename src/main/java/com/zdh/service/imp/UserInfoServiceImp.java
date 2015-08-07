package com.zdh.service.imp;

import com.zdh.dao.UserInfoDao;
import com.zdh.model.UserInfo;
import com.zdh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 */
@Service
@Transactional
public class UserInfoServiceImp implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public Integer insert(UserInfo userInfo){
        return userInfoDao.insert(userInfo);
    }
}
