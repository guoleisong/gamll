package com.gls.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author gls
 * @ClassName GmallManageServiceApplication
 * @Description TOTO
 * @Date 2020-03-07 19:52
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.gls.gmall.mapper")
public class GmallManageServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(GmallManageServiceApplication.class,args);

    }


}
