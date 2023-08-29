import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode26RemoveDuplicates {
    public static void main(String[] args) {

        int [] nums = {-5,-5,1,1,2,2,2,3,4,6,6,6};

        Leetcode26RemoveDuplicates object = new Leetcode26RemoveDuplicates();
        System.out.println(object.removeDuplicates(nums));

        
    }

    public int removeDuplicates(int [] nums){
        
        ArrayList<Integer> nums2 = new ArrayList <> ();
            for (int i = 0; i < nums.length; i++) {
                if (!nums2.contains(nums[i])){
                    nums2.add(nums[i]);
                }
                             
            }
            int k = nums2.size();

            for (int i = 0; i < k; i++) {
                nums[i] = nums2.get(i);
            }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
