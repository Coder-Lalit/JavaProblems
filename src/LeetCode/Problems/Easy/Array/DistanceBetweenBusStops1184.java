package LeetCode.Problems.Easy.Array;

public class DistanceBetweenBusStops1184 {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if(start > destination ) return distanceBetweenBusStops(distance, destination,start);

        int total = 0;
        int oneDir = 0;
        for(int i=0; i<distance.length;i++){
            total+=distance[i];
            if(i >= start && i <=destination-1 ){
                oneDir+=distance[i];
            }

        }

        return Math.min(oneDir,total-oneDir);
    }

    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0},7,2));
    }
}
