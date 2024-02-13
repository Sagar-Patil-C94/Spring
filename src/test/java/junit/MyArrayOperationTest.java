package junit;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayOperationTest {
    private static MyArrayOperation myArrayOperation;
    private static Logger logger = LoggerFactory.getLogger(MyArrayOperationTest.class);

    @BeforeAll
    static void beforeAll() {
        logger.info("Before All");
        myArrayOperation = new MyArrayOperation();
    }

    @BeforeEach
    void beforeEach() {
        logger.info("Before Each");
    }

    // Other Methods Are assertTrue,assertFalse(result,message),assertNull,assertNotNull,assertArrayEquals
    @Test
    void testForThreeElementArray() {
        assertEquals(6, myArrayOperation.sumArrayElements(new int[]{1, 2, 3}), "Expected Result Is : 6");
    }

    @Test
    void testForEmptyArray() {
        assertEquals(0, myArrayOperation.sumArrayElements(new int[]{}), "Expected Result Is 0");
    }

    @AfterEach
    void afterEach() {
        logger.info("After Each");
    }

    @AfterAll
    static void afterAll() {
        logger.info("After All Method");
    }
}
