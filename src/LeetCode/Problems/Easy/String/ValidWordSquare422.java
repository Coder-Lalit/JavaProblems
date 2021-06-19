package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidWordSquare422 {
    public boolean validWordSquare(List<String> rows) {
     int max =0;
        for(int i=0;i<rows.size();i++){
            max= max<rows.get(i).length()?rows.get(i).length():max;
            if(rows.size()!=max)
                return false;
            for(int j=0;j<rows.size();j++){
                if(i!=j){
                    if(rows.get(i).length()-1>=j){
                        if(rows.get(j).length()-1>=i){
                            if(rows.get(i).charAt(j)!=rows.get(j).charAt(i)){
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }

                }

            }
        }

        return true;
    }

    public boolean validWordSquare2(List<String> rows) {
        int max =0;
        for(int i=0;i<rows.size();i++){
            max= max<rows.get(i).length()?rows.get(i).length():max;
            if(rows.size()!=max)
                return false;
            StringBuilder s = new StringBuilder();
            for(int j=0;j<rows.get(i).length();j++){
                if(rows.get(j).length()>i)
                    s.append(rows.get(j).charAt(i));
            }
            if(!s.toString().equals(rows.get(i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidWordSquare422 v = new ValidWordSquare422();
        List<String> rows = new ArrayList<>();
        rows.add("ball");
        rows.add("area");
        rows.add("read");
        rows.add("lady");
        System.out.println(v.validWordSquare2(rows));
        rows.clear();
        rows.add("abcd");
        rows.add("bnrt");
        rows.add("crm");
        rows.add("dt");
        System.out.println(v.validWordSquare2(rows));
        rows.clear();

    }
}
