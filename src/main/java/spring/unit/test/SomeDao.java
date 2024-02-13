package spring.unit.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class SomeDao {
    public int[] getData() {
        return new int[]{10, 20, 30};
    }
}