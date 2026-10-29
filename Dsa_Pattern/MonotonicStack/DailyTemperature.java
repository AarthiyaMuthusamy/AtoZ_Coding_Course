package Dsa_Pattern.MonotonicStack;


import java.util.Arrays;

import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperature = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(findWarmTemperature(temperature)));
    }
    public static int[] findWarmTemperature(int[] temp){
        Stack<Integer> stack =  new Stack<>();
        int[] result = new int[temp.length];


        for (int i = temp.length-1; i >= 0 ; i--) {
            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek()-i;

            stack.push(i);

        }
        return result;
    }
}
