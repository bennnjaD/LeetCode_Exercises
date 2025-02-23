import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_2 {
    /*
    Given an integer array *nums* and an integer *k*, return true if
    there are two distinct indices *i* and *j* in the array
    such that nums[i] == nums[j] and abs(i - j) <= k

    Example:
    Input: nums = [1,2,3,1], k = 3
    Output: true

    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false
     */

    public boolean containsNearbyDuplicate(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int indice = map.get(numbers[i]);
                if ((Math.abs(indice - i)) <= target) {
                    return true;
                }
            } else {
                map.put(numbers[i], i);
            }
        }
        return false;
    }
}
