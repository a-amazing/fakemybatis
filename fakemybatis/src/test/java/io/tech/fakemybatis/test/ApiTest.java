package io.tech.fakemybatis.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.tech.fakemybatis.binding.MapperProxyFactory;
import io.tech.fakemybatis.binding.MapperRegistry;
import io.tech.fakemybatis.session.SqlSession;
import io.tech.fakemybatis.session.defaults.DefaultSqlSession;
import io.tech.fakemybatis.test.dao.IUserDao;

public class ApiTest {
    private static final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void testUserDao() {
        // MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        // //Map<String, String> sqlSession = new HashMap<>();
        // //sqlSession.put("io.tech.fakemybatis.test.dao.IUserDao.queryUserName", "模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户姓名");
        // //sqlSession.put("io.tech.fakemybatis.test.dao.IUserDao.queryUserAge", "模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户年龄");
        // MapperRegistry mapperRegistry = new MapperRegistry();
        // SqlSession sqlSession = new DefaultSqlSession(mapperRegistry);
        // IUserDao userDao = factory.newInstance(sqlSession);

        // String res = userDao.queryUserName("10001");
        // //logger.info("测试结果：{}", res);
        // System.out.println("测试结果：" + res);
    }

}
