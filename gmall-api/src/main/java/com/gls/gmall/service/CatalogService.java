package com.gls.gmall.service;

import com.gls.gmall.bean.PmsBaseCatalog1;
import com.gls.gmall.bean.PmsBaseCatalog2;
import com.gls.gmall.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author gls
 * @ClassName Catalog1Service
 * @Description TOTO
 * @Date 2020-03-07 19:35
 * @Version 1.0
 */
public interface CatalogService {

     List<PmsBaseCatalog1> getCataLog1List();


     List<PmsBaseCatalog3> getCatalog3(String catalog2Id);

     List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
}
