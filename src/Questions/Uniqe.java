package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Uniqe {



    public static void main(String[] args) {
        //print interger occured only once.
        Integer [] num = {1,2,3,4,3,4,5,8};
        //print interger occured only once for sorted array.
        Integer [] num2 = {1,2,3,3,4,4,5,8};
        test(num);
        test1(num);
        test2(num2);
    }

    public static void test (Integer[] num){

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i =0; i< num.length;i++){
            if(hashMap.containsKey(num[i])){
                hashMap.put(num[i],hashMap.get(num[i])+1);
            }
            else {
                hashMap.put(num[i],1);
            }
        }

        List<Map.Entry<Integer, Integer>> collect = hashMap.entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toList());

        System.out.println(collect);

    }

    public static void test1 (Integer[] num){

        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<num.length;i++){
            if(!temp.contains(num[i])){
                temp.add(num[i]);
            }
            else {
                temp.remove(num[i]);
            }
        }
        System.out.println(temp);

    }

    public static void test2 (Integer[] num){

        for(int i=0;i<num.length;i++){
            if(i==num.length-1){
                if (!(num[i]==num[i-1])){
                    System.out.println(num[i]);
                }
            }
            else if( !(num[i]==num[i+1])){
                System.out.println(num[i]);
            }
            else {
                i++;
            }

        }

    }
}
