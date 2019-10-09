package controller;


import bean.UserInfo;
import biz.UserBiz;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author DreamYee
 * @Create 2019/09/03  21:31
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserBiz ub;

    @RequestMapping(value = "/check",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String check(HttpServletRequest request){
        String str="";
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("USERINFO");
        if(obj==null){
            return "1";
        }else{
            return str;
        }

    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String checkLogin(UserInfo ui,HttpServletRequest request){
        HttpSession session=request.getSession();
        ui=ub.checkLogin(ui);
        if(ui==null){
            return"2";//2代表登录失败
        }else {
            session.setAttribute("USERINFO",ui);
        }
        return ui.getUserName();
    }
}
