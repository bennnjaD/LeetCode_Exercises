package Easy;

public class RunningSum {
    /*
    Given an array *nums*. We define a running sum of an array as
    runningSum[i] = sum(nums[0]..nums[i])
    return the running sum of *nums*

    Example:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
     */
    public int[] runningSum(int[] nums) {
        for(int i = 1;i < nums.length;i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

}
