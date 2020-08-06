package org.apache.jdbc.benchmark.descriptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultDescription {

    private ArrayList<ColumnDescriptor> columnDescriptorArrayList;
    private ArrayList<ColumnDescriptor> whereColumnDescriptorArrayList;
    private String statementType;
    private Boolean join = false;
    private Boolean where = false;
    private String comparisonType;
    private String comparison;
    private ArrayList<ColumnDescriptor> unionColumn;
    private Map<String, String> labelsForColumns;

    private String tableLeftName;
    private String tableRightName;

    public ResultDescription() {
        this.unionColumn = new ArrayList<>();
        this.whereColumnDescriptorArrayList = new ArrayList<>();
        this.columnDescriptorArrayList = new ArrayList<>();
        this.labelsForColumns = new HashMap<>();
    }

    public ResultDescription(String sql) { }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public String getTableLeftName() {
        return tableLeftName;
    }

    public String getTableRightName() {
        return tableRightName;
    }

    public void setTableRightName(String tableRightName) {
        this.tableRightName = tableRightName;
    }

    public Boolean getJoin() {
        return join;
    }

    public void setJoin(Boolean join) {
        this.join = join;
    }

    public Boolean getWhere() {
        return where;
    }

    public void setWhere(Boolean where) {
        this.where = where;
    }

    public String getComparisonType() {
        return comparisonType;
    }

    public void setComparisonType(String comparisonType) {
        this.comparisonType = comparisonType;
    }

    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public ArrayList<ColumnDescriptor> getColumnDescriptorArrayList() {
        return columnDescriptorArrayList;
    }

    public void setColumnDescriptorArrayList(ArrayList<ColumnDescriptor> columnDescriptorArrayList) {
        this.columnDescriptorArrayList = columnDescriptorArrayList;
    }

    public ArrayList<ColumnDescriptor> getWhereColumnDescriptorArrayList() {
        return whereColumnDescriptorArrayList;
    }

    public void setWhereColumnDescriptorArrayList(ArrayList<ColumnDescriptor> whereColumnDescriptorArrayList) {
        this.whereColumnDescriptorArrayList = whereColumnDescriptorArrayList;
    }

    public ArrayList<ColumnDescriptor> getUnionColumn() {
        return unionColumn;
    }

    public void setUnionColumn(ArrayList<ColumnDescriptor> unionColumn) {
        this.unionColumn = unionColumn;
    }

    public void setTableLeftName(String tableLeftName) {
        this.tableLeftName = tableLeftName;
    }

    public Map<String, String> getLabelsForColumns() {
        return labelsForColumns;
    }

    public void setLabelsForColumns(Map<String, String> labelsForColumns) {
        this.labelsForColumns = labelsForColumns;
    }
}
