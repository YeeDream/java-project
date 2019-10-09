package biz;

import bean.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author DreamYee
 * @Create 2019/09/03  19:51
 */
public interface UserBiz {
    UserInfo checkLogin(UserInfo ui);
}
