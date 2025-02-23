package Hard;

public class MedianOfTwoSortedArrays {
    /*
    Given two sorted arrays *nums1* and *nums2* of size *m*
    and *n* respectively, return the median of the two
    sorted arrays.

    The overall runtime complexity should be
    O(log (m+n))

    Example:
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000

     */
    public double findMedianSortedArray(int[] nums1, int[] nums2) {
        int[] mergedNumbs = merge(nums1, nums2);

        if (mergedNumbs.length % 2 == 1) {
            return mergedNumbs[mergedNumbs.length / 2];
        } else {
            return (double) mergedNumbs[mergedNumbs.length / 2] +
                    (double) mergedNumbs[(mergedNumbs.length / 2) - 1] / 2;
        }

    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int[] mergedNums = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedNums[k] = nums1[i];
                i++;
            } else {
                mergedNums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            mergedNums[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergedNums[k] = nums1[j];
            j++;
            k++;
        }
        return mergedNums;
    }


}