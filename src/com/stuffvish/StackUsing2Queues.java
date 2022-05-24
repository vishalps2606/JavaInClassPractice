package com.stuffvish;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    static class Stack{

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public int curr_size;

        Stack(){
            curr_size = 0;
        }

        public void push(int x){
            curr_size++;
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        public void pop(){
            if(q1.isEmpty()) return;
            curr_size--;
            q1.remove();
        }

        public int top(){
            if(q1.isEmpty()) return -1;

            return q1.peek();
        }

        public int size(){
            return curr_size;
        }
    }
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());

    }
}
