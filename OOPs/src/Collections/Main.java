package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(54);

        List<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(25);
        vector.add(46);
        System.out.println(vector);
    }
}
