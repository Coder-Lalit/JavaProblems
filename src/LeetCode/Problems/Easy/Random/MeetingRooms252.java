package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingRooms252 {
    public static void main(String [] args){
        //System.out.println(canAttendMeetings(new int [][] {{0,30},{5,10},{15,20}}));
        //System.out.println(canAttendMeetings(new int [][] {{0,5},{5,10},{15,20}}));
        System.out.println(x(new int [][] {{5,10},{0,4},{15,20}}));
    }

    public static String x(int[][] y){
        Arrays.sort(y,(a,b)->Integer.compare(a[0],b[0]));
        System.out.println(y);
        return y.toString();
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        int max=Integer.MIN_VALUE;
        boolean res=true;
        for(int i=0; i<intervals.length;i++){
            max=max<intervals[i][1]?intervals[i][1]:max;
        }
        if(max==Integer.MIN_VALUE){
            return res;
        }
        int[] status = new int[max+1];

        for(int i=0;i<intervals.length && res ;i++){
            int x= intervals[i][0];
            while(res && x<intervals[i][1]){
                if(status[x]==0){
                    status[x]=1;
                }
                else{
                    res=false;
                }
                x++;
            }
        }
        return res;
    }
}
