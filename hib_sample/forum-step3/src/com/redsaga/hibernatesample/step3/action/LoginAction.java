package com.redsaga.hibernatesample.step3.action;

import com.opensymphony.xwork.ModelDriven;
import com.opensymphony.xwork.ActionContext;
import com.redsaga.hibernatesample.step3.User;
import com.redsaga.hibernatesample.step3.ForumService;
import com.redsaga.hibernatesample.step3.ForumServiceFactory;
import com.redsaga.hibernatesample.step3.Board;
import webwork.action.Action;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: cao
 * Date: 2005-5-23
 * Time: 23:34:02
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction extends AbstractAction implements ModelDriven {
    private final static String LOGIN_FAIL="loginfail";
    User loginInfo = new User();

    public String execute() throws Exception {
        ForumService fs = ForumServiceFactory.getHibernateForumService();

        User testUser = fs.getUserByName(loginInfo.getName());

        if (testUser!=null && testUser.getPwd().equals(loginInfo.getPwd()))
        {
            loginInfo = testUser;
            set("loginUser",loginInfo);
            return SUCCESS;
        }else{
        return LOGIN_FAIL;
        }
}

    public Object getModel() {
        return loginInfo;
    }
}
