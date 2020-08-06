package org.apache.jdbc.benchmark.driver;

import java.sql.*;
import java.sql.Array;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class StubConnection implements Connection {


    private boolean isClosed = false;
    private boolean isReadOnly = false;
    private String catalog;
    private int transactionIsolationLevel = 0;
    private int holdAbility = 0;
    private String schema;
    private int timeout;

    Connection connection;

    StubConnection() {
        this.connection = this;
    }

    public StubConnection(Connection connection) {
        this.connection = connection;
    }

    public static StubConnection getInstance() {
        return new StubConnection();
    }

    public Statement createStatement() throws SQLException {
        return new StubStatement();
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new StubPreparedStatement(sql);
    }

    public CallableStatement prepareCall(String sql) throws SQLException {
        return new StubCallableStatement() ;
    }

    public String nativeSQL(String sql) throws SQLException {
        return "Native SQL!";
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {

    }

    public boolean getAutoCommit() throws SQLException {
        return false;
    }

    public void commit() throws SQLException {

    }

    public void rollback() throws SQLException {

    }

    public void close() throws SQLException {
        this.isClosed = true;
    }

    public boolean isClosed() throws SQLException {
        return isClosed;
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        return new StubDatabaseMetaData();
    }

    public void setReadOnly(boolean readOnly) throws SQLException {
        this.isReadOnly = readOnly;
    }

    public boolean isReadOnly() throws SQLException {
        return isReadOnly;
    }

    public void setCatalog(String catalog) throws SQLException {
        this.catalog = catalog;
    }

    public String getCatalog() throws SQLException {
        return catalog;
    }

    public void setTransactionIsolation(int level) throws SQLException {
        this.transactionIsolationLevel = level;
    }

    public int getTransactionIsolation() throws SQLException {
        return transactionIsolationLevel;
    }

    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    public void clearWarnings() throws SQLException {

    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new StubStatement();
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new StubPreparedStatement(sql);
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new StubCallableStatement();
    }

    //TODO: Should be returned custom map or will be enough map.
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return Collections.EMPTY_MAP;
    }

    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {

    }

    public void setHoldability(int holdability) throws SQLException {
        this.holdAbility = holdability;
    }

    public int getHoldability() throws SQLException {
        return holdAbility;
    }

    public Savepoint setSavepoint() throws SQLException {
        return new StubSavepoint();
    }

    public Savepoint setSavepoint(String name) throws SQLException {
        return new StubSavepoint(name);
    }

    public void rollback(Savepoint savepoint) throws SQLException {

    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException {

    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new StubStatement();
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new StubPreparedStatement(sql);
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new StubCallableStatement();
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return new StubPreparedStatement(sql);
    }

    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return new StubPreparedStatement(sql);
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return new StubPreparedStatement(sql);
    }

    public org.apache.jdbc.benchmark.driver.Clob createClob() throws SQLException {
        return new Clob();
    }

    public org.apache.jdbc.benchmark.driver.Blob createBlob() throws SQLException {
        return new Blob();
    }

    public org.apache.jdbc.benchmark.driver.NClob createNClob() throws SQLException {
        return new NClob();
    }

    public org.apache.jdbc.benchmark.driver.SQLXML createSQLXML() throws SQLException {
        return new SQLXML();
    }

    public boolean isValid(int timeout) throws SQLException {
        return true;
    }

    public void setClientInfo(String name, String value) throws SQLClientInfoException {

    }

    public void setClientInfo(Properties properties) throws SQLClientInfoException {

    }

    public String getClientInfo(String name) throws SQLException {
        return "Bootique stub bootique client info";
    }

    public Properties getClientInfo() throws SQLException {
        return new Properties();
    }

    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Array();
    }

    public org.apache.jdbc.benchmark.driver.Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return new Struct();
    }

    public void setSchema(String schema) throws SQLException {
        this.schema = schema;
    }

    public String getSchema() throws SQLException {
        return schema;
    }

    public void abort(Executor executor) throws SQLException {

    }

    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        this.timeout = milliseconds;
    }

    public int getNetworkTimeout() throws SQLException {
        return timeout;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    public boolean getUseUnicode() {
        return true;
    }

    public String getEncoding() {
        return "UTF-8";
    }

}
