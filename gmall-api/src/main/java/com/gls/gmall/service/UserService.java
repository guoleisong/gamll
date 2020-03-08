package com.gls.gmall.service;


import com.gls.gmall.bean.UmsMember;
import com.gls.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAlluser();

    List<UmsMemberReceiveAddress> getMemberReceiveByMemberId(String memberId);
}
