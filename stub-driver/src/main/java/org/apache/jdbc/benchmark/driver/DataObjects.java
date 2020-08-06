package org.apache.jdbc.benchmark.driver;

import com.nhl.dflib.DataFrame;
import org.apache.jdbc.benchmark.descriptor.ResultDescription;

import java.sql.ResultSet;
import java.util.*;

public class DataObjects<T> {

    private static Map<String, DataFrame> dataFrameMap = new HashMap<>();

    public void setObjects(String nameTable, DataFrame dataFrame) {
        dataFrameMap.put(nameTable, dataFrame);
    }

    public Map<String, DataFrame> getDataFrameMap() {
        return dataFrameMap;
    }

    public void setDataFrameMap(DataObjects dataObjects) {
        this.dataFrameMap = dataObjects.dataFrameMap;
    }

    public ResultSet select(ResultDescription description) {

        DataFrame dataFrameRight = null;

        if (!description.getWhere() && !description.getJoin()) {
            DataFrame dataFrame = dataFrameMap.get(description.getTableLeftName());
            return new StubResultSet(description.getColumnDescriptorArrayList(), dataFrame);
        }

        if (description.getWhere()) {

            DataFrame dataFrame = dataFrameMap.get(description.getWhereColumnDescriptorArrayList().get(0).getTableName());
            if (description.getComparisonType() == null) {
                dataFrameRight = dataFrame.filterRows(r ->
                        r.get(description.getWhereColumnDescriptorArrayList().get(0).getName()).toString().startsWith(description.getWhereColumnDescriptorArrayList().get(0).getWhereParam())
                                && r.get(description.getWhereColumnDescriptorArrayList().get(0).getName()).toString().endsWith(description.getWhereColumnDescriptorArrayList().get(0).getWhereParam())
                );
            } else if (description.getComparison().equals("start")) {
                dataFrameRight = dataFrame.filterRows(r ->
                        r.get(description.getWhereColumnDescriptorArrayList().get(0).getName()).toString()
                                .startsWith(description.getWhereColumnDescriptorArrayList().get(0).getWhereParam())
                );
            } else if (description.getComparison().equals("end")) {
                dataFrameRight = dataFrame.filterRows(r ->
                        r.get(description.getWhereColumnDescriptorArrayList().get(0).getName()).toString()
                                .endsWith(description.getWhereColumnDescriptorArrayList().get(0).getWhereParam())
                );
            }
        }

        if (description.getJoin()) {
            if (dataFrameRight == null) {
                dataFrameRight = dataFrameMap.get(description.getTableRightName());
            }
            DataFrame dataFrameLeft = dataFrameMap.get(description.getTableLeftName());

            DataFrame dfv = dataFrameLeft.innerJoin().on(description.getUnionColumn().get(0).getName(), description.getUnionColumn().get(1).getName()).with(dataFrameRight);

            return new StubResultSet(description.getColumnDescriptorArrayList(), dfv);
        } else {
              return new StubResultSet(description.getColumnDescriptorArrayList(), dataFrameRight);
        }
    }

}