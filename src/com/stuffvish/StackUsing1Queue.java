package com.stuffvish;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {

    static class Stack{

        Queue<Integer> q = new LinkedList<>();

        int curr_size;

        Stack(){
            curr_size = 0;
        }

        public void push(int x){
            curr_size++;
            q.add(x);

            for(int i = 0; i < q.size()-1; i++){
                q.add(q.peek());
                q.remove();
            }
        }

        public void pop(){
            if(curr_size == 0) return;
            curr_size--;
            q.remove();
        }

        public int top(){
            if(curr_size == 0) return -1;
            return q.peek();
        }

        public int size(){
            return curr_size;
        }
    }
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(1);

        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
