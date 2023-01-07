package com.song.day01;

/**
 * @Description TODO
 * @Author Song
 * @Date 2022/12/8 22:12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }
}
