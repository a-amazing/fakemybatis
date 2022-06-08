package io.tech.fakemybatis.session.defaults;

import io.tech.fakemybatis.binding.MapperRegistry;
import io.tech.fakemybatis.session.SqlSession;
import io.tech.fakemybatis.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
    
}
