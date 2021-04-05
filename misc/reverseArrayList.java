package misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("city", "town", "state");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
