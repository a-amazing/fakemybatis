package io.tech.fakemybatis.session.defaults;

import io.tech.fakemybatis.binding.MapperRegistry;
import io.tech.fakemybatis.mapping.MappedStatement;
import io.tech.fakemybatis.session.Configuration;
import io.tech.fakemybatis.session.SqlSession;

public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;
    /**
     * 映射器注册机
     */
    private MapperRegistry mapperRegistry;

    public DefaultSqlSession(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + "方法：" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return (T) ("你被代理了！" + "\n方法：" + statement + "\n入参：" + parameter + "\n待执行SQL：" + mappedStatement.getSql());
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return mapperRegistry.getMapper(type, this);
    }
    
}
