package org.apache.jdbc.benchmark.descriptor;

public class ColumnDescriptor {

    private String name;
    private String tableName;
    private String whereParam;

    public ColumnDescriptor() {
        this.name = "";
        this.tableName = "";
        this.whereParam = "";

    }

    public ColumnDescriptor(String tableName) {
        this.name = null;
        this.tableName = tableName;
        this.whereParam = null;
    }

    public ColumnDescriptor(String name, String tableName) {
        this.name = name;
        this.tableName = tableName;
        this.whereParam = null;
    }

    public ColumnDescriptor(String name, String tableName, String whereParam) {
        this.name = name;
        this.tableName = tableName;
        this.whereParam = whereParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getWhereParam() {
        return whereParam;
    }

    public void setWhereParam(String whereParam) {
        this.whereParam = whereParam;
    }
}
