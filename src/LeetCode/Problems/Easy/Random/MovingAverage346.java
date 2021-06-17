package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

class MovingAverage346 {

    private List<Double> sum = new ArrayList<Double>(){{add(0.0);}};
    private int range;
    private int count=0;
    /** Initialize your data structure here. */
    public MovingAverage346(int size) {
        this.range=size;
    }

    public double next(int val) {
        sum.add(sum.get(count)+val);
        count++;
        if(sum.size()<range+1){
            return sum.get(count)/(sum.size()-1);
        }
        else{
            return (sum.get(count)-sum.get(count-range))/range;
        }
    }

    public static void main(String[] args) {
        MovingAverage346 m= new MovingAverage346(1);
        for(int i=0;i<10;i++){
            System.out.println(m.sum.toString());
            System.out.println("moving avg of "+ i+" --> "+m.next(i));

        }

    }
}
