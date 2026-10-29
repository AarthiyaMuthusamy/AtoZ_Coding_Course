package Dsa_Pattern.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        int[] prices = {100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(onlineStockSpan(prices)));
    }
    public static int[] onlineStockSpan(int[] prices){
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0;i<prices.length;i++){
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? i + 1: i-stack.peek();
            stack.push(i);
        }
        return ans;
    }
    /* Leetcode solution for each element separately
     Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;


        while (!stack.isEmpty() &&  price >= stack.peek()[0]){
               span += stack.pop()[1];
        }


        stack.push(new int[]{price,span});

        return span;
    }
     */
}
