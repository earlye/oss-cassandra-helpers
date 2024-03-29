package com.clearcapital.oss.cassandra.annotations;

import com.datastax.driver.core.DataType;

public enum CassandraDataType {
    // simple types:
    BIGINT(DataType.bigint()),
    BLOB(DataType.blob()),
    BOOLEAN(DataType.cboolean()),
    COUNTER(DataType.counter()),
    DOUBLE(DataType.cdouble()),
    INT(DataType.cint()),
    TEXT(DataType.text()),
    TIMESTAMP(DataType.timestamp()),
    //
    LIST_TEXT(DataType.list(DataType.text())),
    // MAP_TEXTBIGINT("map<text, bigint>"),
    // MAP_TEXTBOOLEAN("map<text, boolean>"),
    // MAP_TEXTDOUBLE("map<text, double>"),
    // MAP_TEXTTEXT("map<text, text>"),
    // SET_BOOLEAN("set<boolean>"),
    // SET_DOUBLE("set<double>"),
    // SET_TEXT("set<text>"),
    ;

    private final DataType dataType;

    CassandraDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public DataType getDataType() {
        return dataType;
    }
}
