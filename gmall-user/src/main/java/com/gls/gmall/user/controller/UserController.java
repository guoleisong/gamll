package com.gls.gmall.user.controller;

import com.gls.gmall.user.bean.UmsMember;
import com.gls.gmall.user.bean.UmsMemberReceiveAddress;
import com.gls.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gls
 * @ClassName UserController
 * @Description TOTO
 * @Date 2020-03-01 12:36
 * @Version 1.0
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello world";
    }

    @RequestMapping("getMemberReceiveByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getMemberReceiveByMemberId(String memberId) {
        return userService.getMemberReceiveByMemberId(memberId);
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {

        return userService.getAlluser();
    }


}
