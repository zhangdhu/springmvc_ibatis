package com.zdh.controller;

import com.zdh.model.UserInfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserInfoController {

	@RequestMapping(method = RequestMethod.GET)
	public String insert(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "insert";
	}

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insertPost(UserInfo userInfo) {
//        Integer flag = userInfoServic.insert(userInfo);
        return "success";
    }
}