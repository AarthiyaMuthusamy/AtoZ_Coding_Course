package Dsa_Pattern.BinarySearch.Search.BinarySearchOnAnswer;

public class AllocateMinNumberOfPages {
    public static void main(String[] args) {
        int[] books = {1,2,3,4,5}; //12,34,67,90 //10,20,30,40 //10,20,30,40,50  //12,34,67,90 //5,17,100,11 //1,2,3,4,5
        int students = 2; //2 //2 //3 //3  //2
        System.out.println(findMinPossibleMaxPages(books,students));

    }

    public static int findMax(int[] nums){
        int max = 0;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int sumOfArray(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }

    public static int findMinPossibleMaxPages(int[] books, int students){
        int left = findMax(books);
        int right = sumOfArray(books);
        int ans = -1;
        while (left <= right){
            int mid = left + (right -left) /2;

            if(requiredStudents(mid,books) <= students) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int requiredStudents(int mid , int[] books){
        int sum = books[0];
        int studentsRequired = 1;
        for (int i = 1; i < books.length; i++) {
            sum += books[i];
            if(sum > mid){
                studentsRequired++;
                sum = books[i];
            }

        }
        return studentsRequired;
    }

}
