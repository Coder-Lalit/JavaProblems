package LeetCode.Problems.Easy.ArrayAndList;

public class RobotReturnOrigin657 {
    public static boolean judgeCircle(String moves) {
        int [] pos = new int[]{0,0};

        for(char ch : moves.toCharArray()){
            switch(ch){
                case 'R':
                    pos[1]=pos[1]+1;
                    break;
                case 'L':
                    pos[1]=pos[1]-1;
                    break;
                case 'U':
                    pos[0]=pos[0]-1;
                    break;
                case 'D':
                    pos[0]=pos[0]+1;
                    break;
            }
        }
        return pos[0]==0 && pos[1]==0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UDR"));
    }
}
