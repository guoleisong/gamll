package com.gls.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gls.gmall.bean.UmsMemberReceiveAddress;
import com.gls.gmall.service.UserService;
import com.gls.gmall.bean.UmsMember;
import com.gls.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gls.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author gls
 * @ClassName UserServiceImpl
 * @Description TOTO
 * @Date 2020-03-01 12:37
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper memberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAlluser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getMemberReceiveByMemberId(String memberId) {

        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId", memberId);

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return memberReceiveAddressMapper.selectByExample(e);
    }
}
