package Questions;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println(epochToUserDateTime(1318386508000L));



    }

    public static String epochToUserDateTime(long epoch) {
        //DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String formatted = new SimpleDateFormat("dd/MM/yyyy").format(new Date(epoch));
        System.out.println(formatted);

        return formatted;
    }
}
