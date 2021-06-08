package LeetCode.Problems.Easy.MinStack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> stack = new ArrayList<>();
    private int top = -1;

    public MinStack() {
    }

    public void push(int val) {
        stack.add(val);
        top++;
    }

    public void pop() {
        if (top != -1) {
            stack.remove(top);
            top--;
        }
    }

    public int top() {
        if(top!=-1)
            return stack.get(top);
        return 0;
    }

    public int getMin() {
        if(top!=-1)
            return stack.stream().min(Integer::compare).get();
        return 0;
    }
}
