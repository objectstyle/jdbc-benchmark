package org.apache.jdbc.benchmark.driver;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

public class StubCallableStatement implements CallableStatement {
    @Override
    public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {

    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {

    }

    @Override
    public boolean wasNull() throws SQLException {
        return false;
    }

    @Override
    public String getString(int parameterIndex) throws SQLException {
        return "Stub string.";
    }

    @Override
    public boolean getBoolean(int parameterIndex) throws SQLException {
        return false;
    }

    @Override
    public byte getByte(int parameterIndex) throws SQLException {
        return 0;
    }

    @Override
    public short getShort(int parameterIndex) throws SQLException {
        return 0;
    }

    @Override
    public int getInt(int parameterIndex) throws SQLException {
        return 0;
    }

    @Override
    public long getLong(int parameterIndex) throws SQLException {
        return 0;
    }

    @Override
    public float getFloat(int parameterIndex) throws SQLException {
        return 0;
    }

    @Override
    public double getDouble(int parameterIndex) throws SQLException {
        return 0;
    }

    @Override
    public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException {
        return null;
    }

    @Override
    public byte[] getBytes(int parameterIndex) throws SQLException {
        return new byte[0];
    }

    @Override
    public Date getDate(int parameterIndex) throws SQLException {
        return new Date(parameterIndex);
    }

    @Override
    public Time getTime(int parameterIndex) throws SQLException {
        return new Time(parameterIndex);
    }

    @Override
    public Timestamp getTimestamp(int parameterIndex) throws SQLException {
        return new Timestamp(parameterIndex);
    }

    @Override
    public Object getObject(int parameterIndex) throws SQLException {
        return new Object();
    }

    @Override
    public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
        return new BigDecimal(parameterIndex);
    }

    @Override
    public Object getObject(int parameterIndex, Map<String, Class<?>> map) throws SQLException {
        return new Object();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Ref getRef(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Ref();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Blob getBlob(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Blob();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Clob getClob(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Clob();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Array getArray(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Array();
    }

    @Override
    public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
        return new Date(parameterIndex);
    }

    @Override
    public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
        return new Time(parameterIndex);
    }

    @Override
    public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException {
        return new Timestamp(parameterIndex);
    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType, String typeName) throws SQLException {

    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType) throws SQLException {

    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {

    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {

    }

    @Override
    public URL getURL(int parameterIndex) throws SQLException {
        return null;
    }

    @Override
    public void setURL(String parameterName, URL val) throws SQLException {

    }

    @Override
    public void setNull(String parameterName, int sqlType) throws SQLException {

    }

    @Override
    public void setBoolean(String parameterName, boolean x) throws SQLException {

    }

    @Override
    public void setByte(String parameterName, byte x) throws SQLException {

    }

    @Override
    public void setShort(String parameterName, short x) throws SQLException {

    }

    @Override
    public void setInt(String parameterName, int x) throws SQLException {

    }

    @Override
    public void setLong(String parameterName, long x) throws SQLException {

    }

    @Override
    public void setFloat(String parameterName, float x) throws SQLException {

    }

    @Override
    public void setDouble(String parameterName, double x) throws SQLException {

    }

    @Override
    public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {

    }

    @Override
    public void setString(String parameterName, String x) throws SQLException {

    }

    @Override
    public void setBytes(String parameterName, byte[] x) throws SQLException {

    }

    @Override
    public void setDate(String parameterName, Date x) throws SQLException {

    }

    @Override
    public void setTime(String parameterName, Time x) throws SQLException {

    }

    @Override
    public void setTimestamp(String parameterName, Timestamp x) throws SQLException {

    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {

    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {

    }

    @Override
    public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {

    }

    @Override
    public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {

    }

    @Override
    public void setObject(String parameterName, Object x) throws SQLException {

    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {

    }

    @Override
    public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {

    }

    @Override
    public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {

    }

    @Override
    public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {

    }

    @Override
    public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {

    }

    @Override
    public String getString(String parameterName) throws SQLException {
        return "Stub Bootique string";
    }

    @Override
    public boolean getBoolean(String parameterName) throws SQLException {
        return false;
    }

    @Override
    public byte getByte(String parameterName) throws SQLException {
        return 0;
    }

    @Override
    public short getShort(String parameterName) throws SQLException {
        return 0;
    }

    @Override
    public int getInt(String parameterName) throws SQLException {
        return 0;
    }

    @Override
    public long getLong(String parameterName) throws SQLException {
        return 0;
    }

    @Override
    public float getFloat(String parameterName) throws SQLException {
        return 0;
    }

    @Override
    public double getDouble(String parameterName) throws SQLException {
        return 0;
    }

    @Override
    public byte[] getBytes(String parameterName) throws SQLException {
        return new byte[0];
    }

    @Override
    public Date getDate(String parameterName) throws SQLException {
        return Date.valueOf(parameterName);
    }

    @Override
    public Time getTime(String parameterName) throws SQLException {
        return Time.valueOf(parameterName);
    }

    @Override
    public Timestamp getTimestamp(String parameterName) throws SQLException {
        return Timestamp.valueOf(parameterName);
    }

    @Override
    public Object getObject(String parameterName) throws SQLException {
        return new Object();
    }

    @Override
    public BigDecimal getBigDecimal(String parameterName) throws SQLException {
        return new BigDecimal(parameterName);
    }

    @Override
    public Object getObject(String parameterName, Map<String, Class<?>> map) throws SQLException {
        return new Object();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Ref getRef(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Ref();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Blob getBlob(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Blob();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Clob getClob(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Clob();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.Array getArray(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.Array();
    }

    @Override
    public Date getDate(String parameterName, Calendar cal) throws SQLException {
        return getDate(parameterName);
    }

    @Override
    public Time getTime(String parameterName, Calendar cal) throws SQLException {
        return getTime(parameterName);
    }

    @Override
    public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
        return getTimestamp(parameterName);
    }

    @Override
    public URL getURL(String parameterName) throws SQLException {
        return null;
    }

    @Override
    public org.apache.jdbc.benchmark.driver.RowId getRowId(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.RowId();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.RowId getRowId(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.RowId();
    }

    @Override
    public void setRowId(String parameterName, java.sql.RowId x) throws SQLException {

    }

    @Override
    public void setNString(String parameterName, String value) throws SQLException {

    }

    @Override
    public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {

    }

    @Override
    public void setNClob(String parameterName, java.sql.NClob value) throws SQLException {

    }

    @Override
    public void setClob(String parameterName, Reader reader, long length) throws SQLException {

    }

    @Override
    public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {

    }

    @Override
    public void setNClob(String parameterName, Reader reader, long length) throws SQLException {

    }

    @Override
    public org.apache.jdbc.benchmark.driver.NClob getNClob(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.NClob();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.NClob getNClob(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.NClob();
    }

    @Override
    public void setSQLXML(String parameterName, java.sql.SQLXML xmlObject) throws SQLException {

    }

    @Override
    public org.apache.jdbc.benchmark.driver.SQLXML getSQLXML(int parameterIndex) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.SQLXML();
    }

    @Override
    public org.apache.jdbc.benchmark.driver.SQLXML getSQLXML(String parameterName) throws SQLException {
        return new org.apache.jdbc.benchmark.driver.SQLXML();
    }

    @Override
    public String getNString(int parameterIndex) throws SQLException {
        return "";
    }

    @Override
    public String getNString(String parameterName) throws SQLException {
        return "";
    }

    @Override
    public Reader getNCharacterStream(int parameterIndex) throws SQLException {
        return new StubReader();
    }

    @Override
    public Reader getNCharacterStream(String parameterName) throws SQLException {
        return new StubReader();
    }

    @Override
    public Reader getCharacterStream(int parameterIndex) throws SQLException {
        return new StubReader();
    }

    @Override
    public Reader getCharacterStream(String parameterName) throws SQLException {
        return new StubReader();
    }

    @Override
    public void setBlob(String parameterName, java.sql.Blob x) throws SQLException {

    }

    @Override
    public void setClob(String parameterName, java.sql.Clob x) throws SQLException {

    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {

    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {

    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {

    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x) throws SQLException {

    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x) throws SQLException {

    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader) throws SQLException {

    }

    @Override
    public void setNCharacterStream(String parameterName, Reader value) throws SQLException {

    }

    @Override
    public void setClob(String parameterName, Reader reader) throws SQLException {

    }

    @Override
    public void setBlob(String parameterName, InputStream inputStream) throws SQLException {

    }

    @Override
    public void setNClob(String parameterName, Reader reader) throws SQLException {

    }

    @Override
    public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
        return null;
    }

    @Override
    public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
        return null;
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate() throws SQLException {
        return 0;
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) throws SQLException {

    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {

    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {

    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {

    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {

    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {

    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {

    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {

    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {

    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {

    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) throws SQLException {

    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {

    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {

    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {

    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {

    }

    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {

    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {

    }

    @Override
    public void clearParameters() throws SQLException {

    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {

    }

    @Override
    public void setObject(int parameterIndex, Object x) throws SQLException {

    }

    @Override
    public boolean execute() throws SQLException {
        return false;
    }

    @Override
    public void addBatch() throws SQLException {

    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {

    }

    @Override
    public void setRef(int parameterIndex, java.sql.Ref x) throws SQLException {

    }

    @Override
    public void setBlob(int parameterIndex, java.sql.Blob x) throws SQLException {

    }

    @Override
    public void setClob(int parameterIndex, java.sql.Clob x) throws SQLException {

    }

    @Override
    public void setArray(int parameterIndex, java.sql.Array x) throws SQLException {

    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return null;
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {

    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {

    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {

    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {

    }

    @Override
    public void setURL(int parameterIndex, URL x) throws SQLException {

    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        return null;
    }

    @Override
    public void setRowId(int parameterIndex, java.sql.RowId x) throws SQLException {

    }

    @Override
    public void setNString(int parameterIndex, String value) throws SQLException {

    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {

    }

    @Override
    public void setNClob(int parameterIndex, java.sql.NClob value) throws SQLException {

    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {

    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {

    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {

    }

    @Override
    public void setSQLXML(int parameterIndex, java.sql.SQLXML xmlObject) throws SQLException {

    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {

    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {

    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {

    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {

    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {

    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {

    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {

    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {

    }

    @Override
    public void setClob(int parameterIndex, Reader reader) throws SQLException {

    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {

    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) throws SQLException {

    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        return 0;
    }

    @Override
    public void close() throws SQLException {

    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return 0;
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {

    }

    @Override
    public int getMaxRows() throws SQLException {
        return 0;
    }

    @Override
    public void setMaxRows(int max) throws SQLException {

    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {

    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return 0;
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {

    }

    @Override
    public void cancel() throws SQLException {

    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {

    }

    @Override
    public void setCursorName(String name) throws SQLException {

    }

    @Override
    public boolean execute(String sql) throws SQLException {
        return false;
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return null;
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return 0;
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return false;
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {

    }

    @Override
    public int getFetchDirection() throws SQLException {
        return 0;
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {

    }

    @Override
    public int getFetchSize() throws SQLException {
        return 0;
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return 0;
    }

    @Override
    public int getResultSetType() throws SQLException {
        return 0;
    }

    @Override
    public void addBatch(String sql) throws SQLException {

    }

    @Override
    public void clearBatch() throws SQLException {

    }

    @Override
    public int[] executeBatch() throws SQLException {
        return new int[0];
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return false;
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return null;
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return 0;
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return 0;
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return 0;
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return false;
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return false;
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return false;
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return 0;
    }

    @Override
    public boolean isClosed() throws SQLException {
        return false;
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {

    }

    @Override
    public boolean isPoolable() throws SQLException {
        return false;
    }

    @Override
    public void closeOnCompletion() throws SQLException {

    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}