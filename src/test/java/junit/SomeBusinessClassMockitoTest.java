package junit;

import mockito.SomeBusinessClass;
import mockito.SomeJdbcInterface;
import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessClassMockitoTest {
    @Test
    void testForBasicCase() {
        SomeJdbcInterface someJdbcInterface = mock(SomeJdbcInterface.class);
        when(someJdbcInterface.getAllData()).thenReturn(new int[]{20, 10, 30});
        SomeBusinessClass someBusinessClass = new SomeBusinessClass(someJdbcInterface);
        assertEquals(30, someBusinessClass.greatestData());
    }

    @Test
    void testForEmptyCase() {
        SomeJdbcInterface someJdbcInterface = mock(SomeJdbcInterface.class);
        when(someJdbcInterface.getAllData()).thenReturn(new int[]{});
        SomeBusinessClass someBusinessClass = new SomeBusinessClass(someJdbcInterface);
        assertEquals(Integer.MIN_VALUE, someBusinessClass.greatestData());
    }

    @Test
    void testForNullCase() {
        SomeJdbcInterface someJdbcInterface = mock(SomeJdbcInterface.class);
        when(someJdbcInterface.getAllData()).thenReturn(null);
        SomeBusinessClass someBusinessClass = new SomeBusinessClass(someJdbcInterface);
        assertEquals(0, someBusinessClass.greatestData());
    }
}
