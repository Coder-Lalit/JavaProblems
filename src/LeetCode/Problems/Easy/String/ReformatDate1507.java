package LeetCode.Problems.Easy.String;

public class ReformatDate1507 {
    public String reformatDate(String date) {
        String [] month = new String [] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] s = date.split(" ");
        StringBuilder ans = new StringBuilder();
        ans.append(s[2]+"-");
        for(int i=0;i<month.length;i++){
            if(month[i]==s[1]){
                ans.append((i+1)+"-");
                break;
            }
        }
        for(char ch : s[0].toCharArray()){
            if(Character.isDigit(ch)){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
