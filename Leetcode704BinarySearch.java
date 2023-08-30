public class Leetcode704BinarySearch {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;

        Leetcode704BinarySearch object = new Leetcode704BinarySearch();
        
        System.out.println(object.search(nums, target));
    }

    public int search (int [] nums , int target){
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}
