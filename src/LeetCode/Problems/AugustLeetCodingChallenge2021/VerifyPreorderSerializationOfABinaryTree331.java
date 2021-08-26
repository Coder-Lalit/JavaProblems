package LeetCode.Problems.AugustLeetCodingChallenge2021;

public class VerifyPreorderSerializationOfABinaryTree331 {
    public static boolean isValidSerialization(String preorder) {
        StringBuilder sb = new StringBuilder(preorder);
        while (sb.indexOf(",#,#") != -1) {
            StringBuilder old = new StringBuilder(sb);
            int index = sb.indexOf(",#,#");
            int i=index-1;
            while(i>=0 && sb.charAt(i)!=',' && Character.isDigit(sb.charAt(i))){
                i--;
            }
            if (index - 1 > -1) {
                sb.delete(i+1, index + 3);
            }
            if(old.toString().equals(sb.toString())){
                return false;
            }
        }
        if (sb.toString().equals("#")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        System.out.println(isValidSerialization("9,#"));
        System.out.println(isValidSerialization("1,#,#,#,#"));
        System.out.println(isValidSerialization("9,#,92,#,#"));
    }

}
