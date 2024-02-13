package junit;

import mockito.SomeBusinessClass;
import mockito.SomeJdbcInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessClassMockitoAnnotation {
    @Mock
    private SomeJdbcInterface someJdbcInterface;
    @InjectMocks
    private SomeBusinessClass someBusinessClass;

    @Test
    void testForBasicCase() {
        when(someJdbcInterface.getAllData()).thenReturn(new int[]{20, 10, 30});
        assertEquals(30, someBusinessClass.greatestData());
    }

    @Test
    void testForEmptyCase() {
        when(someJdbcInterface.getAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, someBusinessClass.greatestData());
    }

    @Test
    void testForNullCase() {
        when(someJdbcInterface.getAllData()).thenReturn(null);
        assertEquals(0, someBusinessClass.greatestData());
    }
}
