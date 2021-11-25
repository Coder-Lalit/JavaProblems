package LeetCode.Problems.Easy.ArrayAndList;

public class GoalParserInterpretation1678 {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)=='a'){
                    sb.append("al");
                    i+=3;
                }else{
                    sb.append('o');
                    i++;
                }
            }else {
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }
}
