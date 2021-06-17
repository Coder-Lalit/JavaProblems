package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Logger {
    int d = 10;
    Integer s=0;
    HashMap<Integer, List<String>> map = new HashMap<>();
    HashMap<String,Integer> map2= new HashMap<>();
    public Logger() {

    }

    public boolean shouldPrintMessage(int t, String m) {
        boolean r = false;
        if (map.containsKey(t)) {
            if (!map.get(t).contains(m)) {
                map.get(t).add(m);
                System.out.println(t + ":" + m);
                r = true;
            }
        } else {
            r = true;
            if (t > 9) {
                while(s<(t-9)){
                    if (map.get(s) != null) {
                        map.remove(s);
                    }
                    s++;
                }

            }
            for (List<String> x : map.values()) {
                if (x.contains(m)) {
                    r = false;
                    break;
                }
            }
            if (r) {
                map.put(t, new ArrayList<String>() {{
                    add(m);
                }});
                System.out.println(t + ":" + m);
            }
        }

        return r;
    }

    public boolean shouldPrintMessage2(int t, String m) {
        if(!map2.containsKey(m)){
            map2.put(m,t);
            System.out.println(t + ":" + m);
            return true;
        }
        Integer old =map2.get(m);
        if(t-old>= 10){
            map2.put(m,t);
            System.out.println(t + ":" + m);
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Logger l = new Logger();
        l.shouldPrintMessage2(1, "foo");
        l.shouldPrintMessage2(2, "foo");
        l.shouldPrintMessage2(10, "foo");
        l.shouldPrintMessage2(11, "foo");
        l.shouldPrintMessage2(21, "foo");
        l.shouldPrintMessage2(25, "foo");
    }
}