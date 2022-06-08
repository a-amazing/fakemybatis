package io.tech.fakemybatis.session.defaults;

import io.tech.fakemybatis.binding.MapperRegistry;
import io.tech.fakemybatis.session.Configuration;
import io.tech.fakemybatis.session.SqlSession;
import io.tech.fakemybatis.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.getMapperRegistry());
    }
    
}
