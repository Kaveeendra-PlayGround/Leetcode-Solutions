import java.util.ArrayList;

public class Leetcode217ContainsDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(containDuplicates(nums));
        
    }
    public static boolean containDuplicates (int [] nums){

        

        ArrayList<Integer> nums2 = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            nums2.add(nums[i]);
        }
        //System.out.println(nums2);

        for (int i = 0; i < nums.length; i++) {
            if(nums2.contains(nums[i]) && (nums2.indexOf(nums[i]) !=i)) {
                //if (nums2.indexOf(nums[i]) !=i)
                System.out.println(nums[i]);
                return true;
            }
        }
       
        return false;
    }
}