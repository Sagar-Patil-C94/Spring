package junit;

import mockito.SomeBusinessClass;
import mockito.SomeJdbcInterface;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessClassStumbTest {
    static Logger logger = LoggerFactory.getLogger(SomeBusinessClass.class);

    @BeforeAll
    static void beforeAll() {
        logger.info("Before All");
    }

    @Test
    void stumbTest() {
        assertEquals(30, new SomeBusinessClass(new SomeDataStumb()).greatestData());
    }

    @AfterAll
    static void afterAll() {
        logger.info("After All");
    }

}

class SomeDataStumb implements SomeJdbcInterface {

    @Override
    public int[] getAllData() {
        return new int[]{10, 20, 30};
    }
}