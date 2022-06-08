package io.tech.fakemybatis.mapping;

public class MappedStatement {
    private String resource;
    private String id;
    private String sql;
    private StatementType statementType;
    private ResultSetType resultSetType;
    
    public String getSql() {
        return sql;
    }
    public void setSql(String sql) {
        this.sql = sql;
    }
    public StatementType getStatementType() {
        return statementType;
    }
    public void setStatementType(StatementType statementType) {
        this.statementType = statementType;
    }
    public ResultSetType getResultSetType() {
        return resultSetType;
    }
    public void setResultSetType(ResultSetType resultSetType) {
        this.resultSetType = resultSetType;
    }
    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
