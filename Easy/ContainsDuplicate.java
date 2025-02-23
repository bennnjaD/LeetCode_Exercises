package Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any values
    appears at least twice in the array,
    and return false if every element is distinct
     */

    public boolean contansDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                return true;
            } else {
              set.add(numbers[i]);
            }
        }
        return false;
    }
}
