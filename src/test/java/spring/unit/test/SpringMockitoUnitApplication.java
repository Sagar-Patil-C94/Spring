package spring.unit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SpringMockitoUnitApplication {

    @Mock
    SomeDao someDao;

    @InjectMocks
    SomeBusinessOperation someBusinessOperation;

    @Test
    public void trueTestCase() {
        when(someDao.getData()).thenReturn(new int[]{10, 20, 30});
        assertTrue(someBusinessOperation.search(10));
    }

    @Test
    public void falseTestCase() {
        when(someDao.getData()).thenReturn(new int[]{10, 20, 30});
        assertFalse(someBusinessOperation.search(1000));
    }
}
