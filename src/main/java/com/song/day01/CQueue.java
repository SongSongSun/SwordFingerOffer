package com.song.day01;

import java.util.Stack;

/**
 * @Description TODO
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Song
 * @Date 2022/12/8 20:25
 * @Version 1.0
 */
class CQueue {

    private Stack<Integer> stackLeft;

    private Stack<Integer> stackRight;

    public CQueue() {
        this.stackLeft = new Stack<Integer>();
        this.stackRight = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stackLeft.push(value);
    }

    public int deleteHead() {
        if (stackRight.size() == 0) {
            if (stackLeft.size() == 0) {
                return -1;
            }
            while (stackLeft.size() != 0) {
                Integer pop = stackLeft.pop();
                stackRight.push(pop);
            }
        }
        return stackRight.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
