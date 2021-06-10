package Questions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Office {
    public static void main(String[] args) {
        List<String> cNames = new ArrayList<>();
        cNames.add("AAR Corp Hardware Abscoa Division");
        cNames.add("Abacus Programming Corporation");
        cNames.add("Abberley Kooiman");
        cNames.add("Abbett Electric Corp");
        cNames.add("Abbey Press Inc");

        String [] user = new String[]{"Abhiram Vaddepalli",
                "Ankush Sharma",
                "Arun Konada",
                "Giri Babu Golla",
                "Hari Babu Vadlamudi",
                "Lalit Das",
                "Minh Phan",
                "Ramesh Bankuru",
                "Sai Krishna Datt",
                "Saiteja NV",
                "Somasekhar Bobba",
                "Venu Madhava",
                "Vivek Vardhan Reddy"};


        cNames.forEach(s->{
            for(int i=0;i<25;i++){
                LocalDateTime a =  LocalDateTime.now().minusDays(i);
                double pageViews = Math.floor(Math.random() * 10);
                System.out.println(s
                        +","+a.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))
                        +","+(int)pageViews
                        +","+user[(int)Math.floor(Math.random()*user.length)]);
            }

        });


    }
}
