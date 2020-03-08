package com.gls.gmall.service;

import com.gls.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttributeService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
