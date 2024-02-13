package spring.unit.test;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringUnitTestApplication.class)
public class SpringJunitApplicationTest {
    @Test
    public void trueCaseTest() {
        SomeBusinessOperation someBusinessOperation = new SomeBusinessOperation(new SomeDao());
        assertEquals(true, someBusinessOperation.search(20));
    }

    @Test
    public void falseCaseTest() {
        SomeBusinessOperation someBusinessOperation = new SomeBusinessOperation(new SomeDao());
        assertEquals(false, someBusinessOperation.search(200), "Element Not Found");
    }
}
