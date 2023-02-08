package com.song.day01;

import java.util.Stack;

/**
 * @Description TODO
 * @Author Song
 * @Date 2022/12/8 22:12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-2);
        stack.pop();
        System.out.println(stack.peek());
    }
}
