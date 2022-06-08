package io.tech.fakemybatis.builder;

import io.tech.fakemybatis.session.Configuration;

public abstract class BaseBuilder {
    protected Configuration configuration;

    public BaseBuilder(Configuration configuration){
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}   
