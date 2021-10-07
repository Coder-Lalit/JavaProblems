package LeetCode.Problems.Easy.String;

public class CrawlerLogFolder1598 {
    public static int minOperations(String[] logs) {
        int i = 0;
        for (String log : logs) {
            if (log == "../") i=i>0?i--:0;
            else if (log != "./") i++;
        }
        return i;
    }

    public static void main(String[] args) {
        String[][] input = {{"d1/", "d2/", "../", "d21/", "./"},
                {"d1/", "d2/", "./", "d3/", "../", "d31/"},
                {"d1/", "../", "../", "../"},
                {"./","../","./"}};

        for(String [] in : input){
            System.out.println(minOperations(in));
        }
    }
}

