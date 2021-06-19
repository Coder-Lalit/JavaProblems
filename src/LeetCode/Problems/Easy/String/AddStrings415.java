package LeetCode.Problems.Easy.String;

public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        if(num1.length()<num2.length()){
            return addStrings(num2,num1);
        }
        if(num1=="0"){
            return num2;
        }
        if(num2=="0"){
            return num1;
        }
        StringBuilder sum= new StringBuilder();
        int carry=0;
        int diff = num1.length()-num2.length();
        for(int i=num1.length()-1;i>=0;i--){
            int x= 0;
            if(i-diff>=0){
                x=Integer.valueOf(num1.charAt(i)+"")+Integer.valueOf(num2.charAt(i-diff)+"")+carry;
            }else{
                x=Integer.valueOf(num1.charAt(i)+"")+carry;
            }
            if(x>9){
                carry=1;
                x=x-10;
            }else{
                carry=0;
            }
            sum.append(String.valueOf(x));
        }
        return carry==1?sum.append(carry).reverse().toString():sum.reverse().toString();
    }
    public String addString2(String num1,String num2){
        StringBuilder res = new StringBuilder();

        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            res.append(value);
            p1--;
            p2--;
        }

        if (carry != 0)
            res.append(carry);

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        AddStrings415 a = new AddStrings415();
        System.out.println(a.addString2("1","9"));
    }
}
