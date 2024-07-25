import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> put = new ArrayList<>();
                        put.add(nums[i]);
                        put.add(nums[j]);
                        put.add(nums[left]);
                        put.add(nums[right]);

                        if (!set.contains(put)) {
                            set.add(put);
                        }
                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    }
                }
            }
        }
        list.addAll(set);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(nums, target);
        System.out.println(result);
    }
}