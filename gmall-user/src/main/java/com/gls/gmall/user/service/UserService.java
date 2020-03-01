package com.gls.gmall.user.service;

import com.gls.gmall.user.bean.UmsMember;
import com.gls.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAlluser();

    List<UmsMemberReceiveAddress> getMemberReceiveByMemberId(String memberId);
}
