public class SearchInsertPosition {
    /*
    Given a sorted array of distinct integers and a target value, return the index if the target
    is found. If not, return the index where it would be if it were inserter in order.

    You must write an algorithm with O(log n) runtime complexity.
     */

    //COMPLEJIDAD O(N)
    public int searchInsert(int[] nums, int target) {
        int value = 0;
        int index = 0;
        while (value != target && index < nums.length) {
            value = nums[index];
            index++;
        }

        if (value == target) {
            return index;
        }
        else {
            return index + 1;
        }
    }

    //COMPLEJIDAD O(log N) con Binary Search
    public int searchInsertBetter(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target encontrado
            } else if (nums[mid] < target) {
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; // Buscar en la mitad izquierda
            }
        }

        // Si no se encuentra, 'left' es la posición correcta para insertar
        return left;
    }
}
