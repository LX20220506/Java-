
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    public static final Logger log = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        log.info("这是info");
        log.error("这是error");
    }
}
