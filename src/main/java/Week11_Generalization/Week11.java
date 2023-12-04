package Week11_Generalization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week11 {
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
}
