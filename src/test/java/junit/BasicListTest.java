package junit;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasicListTest {
    @Test
    void simpleListTest() {
        List list = mock(List.class);
        when(list.size()).thenReturn(3);
        assertEquals(3, list.size());
    }

    @Test
    void multipleReturnListTest() {
        List list = mock(List.class);
        when(list.size()).thenReturn(3).thenReturn(4);
        assertEquals(3, list.size());
        assertEquals(4, list.size());
    }

    //Specific Parameter
    @Test
    void getListTest() {
        List list = mock(List.class);
        when(list.get(0)).thenReturn(3);
        assertEquals(3, list.get(0));
    }

    //Generic Parameters
    @Test
    void getListTest2() {
        List list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenReturn(3);
        assertEquals(3, list.get(Mockito.anyInt()));
    }
}
