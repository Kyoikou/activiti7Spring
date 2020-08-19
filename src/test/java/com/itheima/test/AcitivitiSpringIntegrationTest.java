package com.itheima.test;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring 整合测试
 * 目标：
 * 1、mysql中是否生成对应的表
 * 2、输出一个Repository对象
 */
@RunWith(SpringJUnit4ClassRunner.class) // 加载spring接junit整合类
@ContextConfiguration(locations = "classpath:activiti-spring.xml") //加载配置文件位置
public class AcitivitiSpringIntegrationTest {
    @Autowired
    private RepositoryService repositoryService;

    @Test
    public void test() {
        System.out.println("部署对象" + repositoryService);
    }
}
