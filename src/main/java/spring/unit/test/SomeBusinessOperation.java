package spring.unit.test;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class SomeBusinessOperation {
    @Autowired
    SomeDao someDao;

    public boolean search(int number) {
        int[] data = someDao.getData();
        return Arrays.binarySearch(data, number) >= 0;
    }
}
