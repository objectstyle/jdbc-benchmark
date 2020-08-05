package driver.benchmark;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import com.nhl.dflib.DataFrame;
import com.nhl.dflib.csv.Csv;
import org.apache.jdbc.benchmark.driver.DataObjects;
import org.apache.jdbc.benchmark.driver.StubPreparedStatement;
import org.apache.jdbc.benchmark.descriptor.ResultDescription;
import org.apache.jdbc.benchmark.parser.ParseException;
import org.apache.jdbc.benchmark.parser.StubParser;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@Warmup(iterations = 5, time = 2)
@Measurement(iterations = 6, time = 1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(2)
@State(Scope.Benchmark)
public class StubPreparedStatementBenchmark {

    private StubPreparedStatement stubPreparedStatement;

    @Setup(Level.Trial)
    public void setUp() {

        DataObjects dataObjects = new DataObjects();

        DataFrame dataFrameArtist = Csv.loader()
                .intColumn("id")
                .dateColumn("DATE_OF_BIRTH")
                .intColumn("ID")
                .load("src/main/resources/artists.csv");

        DataFrame dataFrameGallery = Csv.loader()
                .intColumn("id")
                .intColumn("ID")
                .load("src/main/resources/gallery.csv");

        DataFrame dataFramePainting = Csv.loader()
                .intColumn("id")
                .intColumn("ID")
                .intColumn("ARTIST_ID")
                .intColumn("GALLERY_ID")
                .load("src/main/resources/painting.csv");

        dataObjects.setObjects("artist", dataFrameArtist);
        dataObjects.setObjects("gallery", dataFrameGallery);
        dataObjects.setObjects("painting", dataFramePainting);

        stubPreparedStatement = new StubPreparedStatement("SELECT t0.DATE_OF_BIRTH, t0.NAME, t0.ID FROM cayenne_demo.artist t0");

    }

    @Benchmark
    public StubPreparedStatement createStatement() {
        return new StubPreparedStatement("SELECT t0.DATE_OF_BIRTH, t0.NAME, t0.ID FROM cayenne_demo.artist t0");
    }

    @Benchmark
    public ResultSet executeStatementBenchmark() throws SQLException {
        return stubPreparedStatement.executeQuery();
    }

    @Benchmark
    public ResultDescription resultDescription() throws ParseException {
        String query = "SELECT t0.DATE_OF_BIRTH, t0.NAME, t0.ID FROM cayenne_demo.artist t0";
        return StubParser.initParser(new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8)));
    }

    @Benchmark
    public StubPreparedStatement updateStatement() {
        return new StubPreparedStatement("UPDATE");
    }
}
