package LeetCode.Challenges.Y2021.August;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {
    public static boolean isValidSudoku(char[][] board) {
        return allRowColumnValid(board) && boxValidation(board);
    }

    static boolean allRowColumnValid(char[][] b){
        Set<Character> r = new HashSet<>();
        Set<Character> c = new HashSet<>();
        for(int k=0;k<9;k++){
            r.clear();
            c.clear();
            for(int l=0;l<9;l++){
                if(b[k][l]!='.' || ((b[k][l]-'0')<=9 && (b[k][l]-'0')>=1)){
                    if(!r.contains(b[k][l])) r.add(b[k][l]);
                    else return false;
                }
                if(b[l][k]!='.'|| ((b[l][k]-'0')<=9 && (b[l][k]-'0')>=1)){
                    if(!c.contains(b[l][k]) ) c.add(b[l][k]);
                    else return false;
                }
            }
        }
        return true;
    }

    static boolean boxValidation(char[][] b){
        Set<Character> n = new HashSet<>();
        for(int k=0; k<9;k=k+3){
            for(int l=0;l<9;l=l+3){
                n.clear();
                for(int i=k;i<k+3;i++){
                    for(int j=l;j<l+3;j++){
                        if(b[i][j]!='.' || ((b[i][j]-'0')<=9 && (b[i][j]-'0')>=1)){
                            if(!n.contains(b[i][j])) n.add(b[i][j]);
                            else return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char [][] b = new char[][]{
                {'5','3','.', '.','7','.', '.','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','6','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','3', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'}
        };
        System.out.println(allRowColumnValid(b));
        System.out.println(boxValidation(b));

    }
}
