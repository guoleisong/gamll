package com.gls.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gls.gmall.bean.PmsBaseCatalog1;
import com.gls.gmall.bean.PmsBaseCatalog2;
import com.gls.gmall.bean.PmsBaseCatalog3;
import com.gls.gmall.mapper.PmsBaseCatalog1Mapper;
import com.gls.gmall.mapper.PmsBaseCatalog2Mapper;
import com.gls.gmall.mapper.PmsBaseCatalog3Mapper;
import com.gls.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author gls
 * @ClassName CatalogService
 * @Description TOTO
 * @Date 2020-03-07 19:38
 * @Version 1.0
 */
@Service
public class CatalogServiceImpl implements CatalogService {

   @Autowired
   PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

   @Autowired
   PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;


   @Autowired
   PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;



    @Override
    public List<PmsBaseCatalog1> getCataLog1List() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> pmsBaseCatalog3s = pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);

        return pmsBaseCatalog3s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> pmsBaseCatalog2s = pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);

        return pmsBaseCatalog2s;
    }
}
