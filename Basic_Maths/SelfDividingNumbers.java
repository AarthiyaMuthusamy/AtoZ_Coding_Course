import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividing(left,right));
    }

    public static List<Integer> selfDividing(int left, int right){
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isSelfDividing(int n){
        int original = n;
        while (n>0){
            int digit = n%10;
            if(digit == 0)
                return false;
            if(original%digit != 0)
                return false;
            n/=10;
        }
        return true;
    }
}
