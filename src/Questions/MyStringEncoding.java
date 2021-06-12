package Questions;

public class MyStringEncoding {

    public static void main(String[] args) {
        System.out.println(encoding("AAABBCC"));
    }
    public static String encoding(String s){
        StringBuffer r = new StringBuffer();
        int count=1;
        r.append(s.charAt(0));
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                r.append(count);
                count=1;
                r.append(s.charAt(i+1));
            }
            if(i==s.length()-2){
                r.append(count);
            }

        }
        return r.toString();

    }
}
