package org.apache.jdbc.benchmark.driver;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

public class Blob implements java.sql.Blob {
    @Override
    public long length() throws SQLException {
        return 0;
    }

    @Override
    public byte[] getBytes(long pos, int length) throws SQLException {
        return new byte[0];
    }

    @Override
    public InputStream getBinaryStream() throws SQLException {
        return null;
    }

    @Override
    public long position(byte[] pattern, long start) throws SQLException {
        return 0;
    }

    @Override
    public long position(java.sql.Blob pattern, long start) throws SQLException {
        return 0;
    }

    @Override
    public int setBytes(long pos, byte[] bytes) throws SQLException {
        return 0;
    }

    @Override
    public int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException {
        return 0;
    }

    @Override
    public OutputStream setBinaryStream(long pos) throws SQLException {
        return null;
    }

    @Override
    public void truncate(long len) throws SQLException {

    }

    @Override
    public void free() throws SQLException {

    }

    @Override
    public InputStream getBinaryStream(long pos, long length) throws SQLException {
        return null;
    }
}
