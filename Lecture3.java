import java.util.ArrayList;
import java.util.List;

public class Lecture3 {
    public static int firstOccurrence(List<Integer> nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        } else if (start == end) {
            return (nums.get(start) == target) ? start : -1;
        } else {
            int mid = start + (end - start) / 2;
            if (nums.get(mid) < target) {
                return firstOccurrence(nums, mid + 1, end, target);
            } else if (nums.get(mid) > target) {
                return firstOccurrence(nums, start, mid - 1, target);
            } else {
                if (mid == 0) {
                    return mid;
                }
                return firstOccurrence(nums, start, mid - 1, target);
            }
        }
    }

    public static int lastOccurrence(List<Integer> nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        } else if (start == end) {
            return (nums.get(start) == target) ? start : -1;
        } else {
            int mid = start + (end - start) / 2;
            if (nums.get(mid) < target) {
                return lastOccurrence(nums, mid + 1, end, target);
            } else if (nums.get(mid) > target) {
                return lastOccurrence(nums, start, mid - 1, target);
            } else {
                if (mid == end || (mid + 1 <= end && nums.get(mid) < nums.get(mid + 1))) {
                    return mid;
                }
                return lastOccurrence(nums, mid + 1, end, target);
            }
        }
    }

    public static List<Integer> frstAndLastOccurrence(List<Integer> nums, int target) {
        int first = firstOccurrence(nums, 0, nums.size() - 1, target);
        int last = lastOccurrence(nums, 0, nums.size() - 1, target);
        return List.of(first, last);
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 2, 3, 4, 5);
        int target = 2;
        List<Integer> result = frstAndLastOccurrence(nums, target);
        System.out.println("First occurrence: " + result.get(0));
        System.out.println("Last occurrence: " + result.get(1));
    }
}

