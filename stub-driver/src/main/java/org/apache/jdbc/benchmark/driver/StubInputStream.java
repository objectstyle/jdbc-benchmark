package org.apache.jdbc.benchmark.driver;

import java.io.IOException;
import java.io.InputStream;

public class StubInputStream extends InputStream {
    @Override
    public int read() throws IOException {
        return 0;
    }
}
