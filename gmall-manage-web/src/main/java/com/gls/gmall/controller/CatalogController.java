package com.gls.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gls.gmall.bean.PmsBaseCatalog1;
import com.gls.gmall.bean.PmsBaseCatalog2;
import com.gls.gmall.bean.PmsBaseCatalog3;
import com.gls.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gls
 * @ClassName CatalogController
 * @Description TOTO
 * @Date 2020-03-07 19:17
 * @Version 1.0
 */
@Controller
@CrossOrigin
public class CatalogController {


    @Reference
    CatalogService catalogService;


    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCataLog1List(){
        List<PmsBaseCatalog1> list = catalogService.getCataLog1List();
        return list;
    }


    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){

        List<PmsBaseCatalog3> catalog3s = catalogService.getCatalog3(catalog2Id);
        return catalog3s;
    }


    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){

        List<PmsBaseCatalog2> catalog2s = catalogService.getCatalog2(catalog1Id);
        return catalog2s;
    }




}
