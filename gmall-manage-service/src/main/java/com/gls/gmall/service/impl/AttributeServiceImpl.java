package com.gls.gmall.service.impl;

import com.gls.gmall.bean.PmsBaseAttrInfo;
import com.gls.gmall.mapper.PmsBaseAttrInfoMapper;
import com.gls.gmall.mapper.PmsBaseAttrValueMapper;
import com.gls.gmall.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gls
 * @ClassName AttributeService
 * @Description TOTO
 * @Date 2020-03-07 20:17
 * @Version 1.0
 */
@Service
public class AttributeServiceImpl implements AttributeService {


    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;


    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }
}
