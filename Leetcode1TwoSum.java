import java.util.Arrays;

public class Leetcode1TwoSum{

    public static void main(String[] args) {

        int [] nums = {2,7,11,15};
        int target = 9;
        
        nums = twosum(nums, target);
        System.out.println(Arrays.toString(nums));
        
    }

    public static int [] twosum (int [] nums, int target){
        int [] index = new int [2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == (nums[i]+nums[j])){
                    index [0] = i;
                    index [1] = j;
                    return index;
                }
            }
        }
        return index;
    }


    


}

