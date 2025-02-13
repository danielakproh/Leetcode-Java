import java.util.Arrays;

class Solution2 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        boolean result = containsDuplicate(new int[] { 1, 2, 5, 1 });
        System.out.println(result);
    }
}
