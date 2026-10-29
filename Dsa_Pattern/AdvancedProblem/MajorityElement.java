package Dsa_Pattern.AdvancedProblem;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(nums));

    }
    public static int findMajorityElement(int[] nums){
        //boyer-moore voting algorithm
        int candidate = 0;
        int count = 0;

        for (int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }

}
