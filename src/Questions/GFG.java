package Questions;

import java.lang.*;
import java.util.Scanner;

class GFG {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] string = new String [sc.nextInt()*3];
        sc.nextLine();

        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }

        for(int j =0;j<string.length;){
            int c1Total=0;
            int c2Total=0;
            String[] s = string[j + 1].split(" ");
            String[] s1 = string[j + 2].split(" ");
            for(int k=0;k < s.length;k++){
                c1Total=c1Total+Integer.parseInt(s[k]);
            }
            for(int l=0;l < s1.length;l++){
                c2Total=c2Total+Integer.parseInt(s1[l]);
            }
            System.out.println(c1Total>c2Total?"C1":"C2");
            j=j+3;
        }

    }
}