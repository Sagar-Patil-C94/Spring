package mockito;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SomeBusinessClass {
    SomeJdbcInterface myDataInterface;

    public int greatestData() {
        int greatest = Integer.MIN_VALUE;
        try {
            int[] data = myDataInterface.getAllData();
            for (int dataItem : data) {
                if (dataItem > greatest) {
                    greatest = dataItem;
                }
            }
            return greatest;
        } catch (Exception e) {
            return 0;
        }
    }
}
