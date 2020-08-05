package org.apache.jdbc.benchmark.driver;

import java.io.IOException;
import java.io.Reader;

public class StubReader extends Reader {
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
