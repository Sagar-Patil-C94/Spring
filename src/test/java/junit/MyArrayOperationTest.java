package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyArrayOperationTest {
    private static final MyArrayOperation myArrayOperation = new MyArrayOperation();

    @Test
    void testForThreeElementArray() {
        assertEquals(6, myArrayOperation.sumArrayElements(new int[]{1, 2, 3}));
    }

    @Test
    void testForEmptyArray() {
        assertEquals(0, myArrayOperation.sumArrayElements(new int[]{}));
    }
}
