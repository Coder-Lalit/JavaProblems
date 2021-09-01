package LeetCode.Problems.Easy.ArrayAndList.TwoDArray;

import java.util.HashSet;
import java.util.Set;

public class FindWinnerOnATicTacToeGame1257 {
    public static String tictactoe(int[][] moves) {

        char ttt [][]= {{'.','.','.'},{'.','.','.'},{'.','.','.'}};
        for(int i=0;i<moves.length;i++){
            if(i%2==0) ttt[moves[i][0]][moves[i][1]]='A';
            else ttt[moves[i][0]][moves[i][1]]='B';
        }

        for(int i=0;i<3;i++){
            if(ttt[i][0]==ttt[i][1] && ttt[i][0]==ttt[i][2] && ttt[i][0]!='.') return ttt[i][0]+"";
            if(ttt[0][i]==ttt[1][i] && ttt[0][i]==ttt[2][i] && ttt[0][i]!='.') return ttt[0][i]+"";
        }

        if(ttt[0][0]==ttt[1][1] && ttt[1][1]==ttt[2][2] && ttt[0][0] != '.') return ttt[0][0]+"";

        if(ttt[0][2]==ttt[1][1] && ttt[1][1]==ttt[2][0] && ttt[0][2] != '.') return ttt[0][2]+"";

        return moves.length<9 ? "Pending" : "Draw";
    }

    public static String tictactoe2(int[][] moves) {

        Set<Character> rows [] = new HashSet[3];
        Set<Character> cols [] = new HashSet[3];
        Set<Character> digonals [] = new HashSet[3];


        char[][] ttt=new char[3][3];
        for(int i = 0; i<moves.length; i++){
            if(i%2==0) ttt[moves[i][0]][moves[i][1]]='A';
            else ttt[moves[i][0]][moves[i][1]]='B';
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                rows[i].add(ttt[i][j]);
                cols[j].add(ttt[j][i]);
                if(i==j) digonals[0].add(ttt[i][j]);
                if(i+j==2) digonals[1].add(ttt[i][j]);
            }
        }

        for(int i=0;i<3;i++){
            if(rows[i].size()==1 && !rows[i].contains('.')) return ttt[i][0]+"";
            if(cols[i].size()==1 && !cols[i].contains('.')) return ttt[0][i]+"";
            if(digonals[i].size()==1 && !digonals[i].contains('.')) return i==0?ttt[0][0]+"":ttt[2][0]+"";

        }
        return moves.length<9 ? "Pending" : "Draw";
    }

    public static void main(String[] args) {
        //System.out.println(tictactoe(new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}}));
        System.out.println(tictactoe2(new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}}));
        //System.out.println(tictactoe(new int[][]{{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}}));
    }
}
