package com.stuffvish;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue{

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        int curr_size;
        Queue(){
            curr_size = 0;
        }

        void pushed(int x){
            curr_size++;
            s1.push(x);
        }

        void poped(){
            if(!s2.isEmpty()){
                curr_size--;
                s2.pop();
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                    s1.pop();
                }
                curr_size--;
                s2.pop();
            }
        }

        int top(){
            if(!s2.isEmpty()){
                return s2.peek();
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                    s1.pop();
                }
                return s2.peek();
            }
        }

        int size(){
            return curr_size;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.pushed(2);
        q.pushed(3);
        q.pushed(5);
        q.pushed(1);

        System.out.println(q.top());
        q.poped();
        System.out.println(q.top());
        System.out.println(q.size());
    }
}
