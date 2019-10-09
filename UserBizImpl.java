package biz.Impl;

import bean.UserInfo;
import biz.UserBiz;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author DreamYee
 * @Create 2019/09/03  19:52
 */

@Service
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserMapper um;

    @Override
    public UserInfo checkLogin(UserInfo ui) {
        return um.checkLogin(ui);
    }
}
