package mapper;

import bean.UserInfo;


/**
 * @Author DreamYee
 * @Create 2019/7/22  21:27
 */
public interface UserMapper {
    //检测用户登录
    UserInfo checkLogin(UserInfo ui);
}
