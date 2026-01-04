import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[]{map.get(t), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);

        int n = g.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = g.nextInt();
        }

        int target = g.nextInt();
        int[] res = twoSum(nums, target);

        if (res != null) {
            System.out.println(res[0] + " " + res[1]);
        } else {
            System.out.println("No solution");
        }
        g.close();
    }
}
