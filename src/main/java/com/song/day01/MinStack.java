package com.song.day01;

import java.util.Stack;

/**
 * @Description https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=y2zhkbj
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author Song
 * @Date 2022/12/8 21:16
 * @Version 1.0
 */
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.size() == 0) {
            minStack.push(x);
        } else {
             Integer peek = minStack.peek();
            if (x < peek) {
                minStack.push(x);
            } else {
                minStack.push(peek);
            }
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */