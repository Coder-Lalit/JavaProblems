package LeetCode.Problems.Easy.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        //System.out.println(myStack.empty());
    }
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int top;
        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            q1.add(x);
            top=x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while(q1.size()>1){
                top=q1.remove();
                q2.add(top);
            }
            int res=q1.remove();
            Queue<Integer> temp = q1;
            q1=q2;
            q2=temp;
            return res;
        }

        /** Get the top element. */
        public int top() {
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.isEmpty();
        }

    }
}
