package com.gls.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gls.gmall.bean.PmsBaseAttrInfo;
import com.gls.gmall.service.AttributeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gls
 * @ClassName AttrController
 * @Description TOTO
 * @Date 2020-03-07 20:13
 * @Version 1.0
 */
@Controller
@CrossOrigin
public class AttrController {


    @Reference
    AttributeService attributeService;

    @RequestMapping("saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){

        return "success";
    }


    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> list =  attributeService.attrInfoList(catalog3Id);
        return list;
    }



}
