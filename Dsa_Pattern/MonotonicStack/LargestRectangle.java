package Dsa_Pattern.MonotonicStack;

import java.util.Map;
import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        int[] heights = {2,4}; //2,1,5,6,2,3  //2,4,2,1  //6,2,5,4,5,1,6
        System.out.println(maxAreaRectangle(heights));
    }
    public static int maxAreaRectangle(int[] heights){
        int maxArea = 0;
        Stack<Integer> stack =  new Stack<>();

        for (int i = 0;i<heights.length;i++){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                int poppedIndex = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek()-1; //when stack is empty return the current index
                int Area = heights[poppedIndex] * width;
                if(Area > maxArea){
                    maxArea = Area;
                }

            }
            stack.push(i);


        }
        while (!stack.isEmpty()){
            int poppedIndex = stack.pop();
            int width = stack.isEmpty() ? heights.length : heights.length - stack.peek()-1;
            int Area = heights[poppedIndex] * width;
            maxArea = Math.max(maxArea,Area);

        }
        return maxArea;
    }
}
