package leetCode_sumTwoNum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumAddUpToTarget {
    //Input nums=[2,7,11,15], target= 9
    //output: [0,1]
    //Explanation: B/c nums[0] + nums[1] == 9, we return [0,1]
    public static void main(String[] args) {
       
    }
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> myMap=new HashMap<>();
        for(int i=0;i<nums.length; i++){
            Integer numsIndex= myMap.get(nums[i]);
            if(numsIndex !=null){
                return new int[]{i, numsIndex};
            }
            myMap.put(target-nums[i], i);
       /*     for(int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] ==target){
                    return new int[]{i + j};
                }
            }*/
        }
        return nums;
    }
}
