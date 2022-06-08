package io.tech.fakemybatis.builder.xml;

import java.io.Reader;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

import io.tech.fakemybatis.builder.BaseBuilder;
import io.tech.fakemybatis.io.Resources;
import io.tech.fakemybatis.mapping.MappedStatement;
import io.tech.fakemybatis.session.Configuration;

public class XMLConfigBuilder extends BaseBuilder {

    private Element root;

    public XMLConfigBuilder(Reader reader) {
        // 1. 调用父类初始化Configuration
        super(new Configuration());
        // 2. dom4j 处理 xml
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(new InputSource(reader));
            root = document.getRootElement();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public Configuration parse() {
        try {
            // 解析映射器
            mapperElement(root.element("mappers"));
        } catch (Exception e) {
            throw new RuntimeException("Error parsing SQL Mapper Configuration. Cause: " + e, e);
        }
        return configuration;
    }

    private void mapperElement(Element mappers) throws Exception {
        List<Element> mapperList = mappers.elements("mapper");
        for (Element e : mapperList) {
            // 解析处理，具体参照源码
            // 添加解析 SQL
            configuration.addMappedStatement(new MappedStatement());
        }
        String namespace = "";
        // 注册Mapper映射器
        configuration.addMapper(Resources.classForName(namespace));
    }

}
