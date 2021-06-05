package LeetCode.Problems.Easy.Tree;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1101", "1111"));

    }

    public static String addBinary(String a, String b) {
        if(b.length()==0){
            return a;
        }else if(a.length()==0){
            return b;
        }
        if(a.length()<b.length()){
            return addBinary(b,a);
        }
        StringBuilder result = new StringBuilder();
        char carry = '0';
        char tempResult = '0';
        int x=a.length();
        int y=b.length();
        int c=1;
        while(x!=0){
            char charA=a.charAt(a.length()-c);
            char tempCarry ='0';
            if((y-c)>=0){
                char charB=b.charAt(b.length()-c);
                if(charA=='1' && charB=='1'){
                    tempCarry='1';
                }
                else if(charA== '0' && charB=='0'){
                    tempResult='0';
                }
                else {
                    tempResult='1';
                }
            }else{
                tempResult=charA;
            }

            if(carry=='1' && tempCarry=='1'){
                result.append('1');
                carry='1';
            }
            else if(carry=='0' && tempCarry=='1'){
                result.append(0);
                carry='1';
            }
            else if(carry== '0' && tempResult=='1'){
                result.append('1');
                carry='0';
            }
            else if(carry== '1' && tempResult=='1'){
                result.append('0');
                carry='1';
            }
            else if(carry=='1'){
                result.append('1');
                carry='0';
            }
            else {
                result.append('0');
                carry='0';
            }
            c++;
            x--;
            if(x==0 && carry=='1'){
                result.append(1);
            }
        }
        return result.reverse().toString();
    }

}
