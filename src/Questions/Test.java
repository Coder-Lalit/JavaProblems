package Questions;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        System.out.println(a.size());
        a.forEach(ab-> System.out.println(ab));
        a.stream().forEach(x->{

        });
    }
}
