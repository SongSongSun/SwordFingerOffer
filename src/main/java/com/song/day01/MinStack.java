package com.song.day01;

/**
 * @Description https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=y2zhkbj
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author Song
 * @Date 2022/12/8 21:16
 * @Version 1.0
 */
class MinStack {
    private int end = 0;

    private int[] stack;

    private int[] minArray;
    private int minIndexEnd = 1;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new int[20000];
        minArray = new int[20000];
    }

    public void push(int x) {
        stack[end] = x;
        if (x <= stack[minArray[minIndexEnd - 1]]) {
            minArray[minIndexEnd - 1] = end;
            minIndexEnd++;
        }
        end++;
    }

    public void pop() {
        if (end == 0) {
            return;
        }
        if (end - 1 <= minArray[minIndexEnd - 2]) {
            minIndexEnd--;
        }
        end--;
    }

    public int top() {
        if (end == 0) {
            return stack[end];
        }
        return stack[end - 1];
    }

    public int min() {
        return stack[minArray[minIndexEnd - 2]];
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