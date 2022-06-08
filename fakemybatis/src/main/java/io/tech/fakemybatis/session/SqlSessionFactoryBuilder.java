package io.tech.fakemybatis.session;

import java.io.Reader;

import io.tech.fakemybatis.builder.xml.XMLConfigBuilder;
import io.tech.fakemybatis.session.defaults.DefaultSqlSessionFactory;

public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }

}
