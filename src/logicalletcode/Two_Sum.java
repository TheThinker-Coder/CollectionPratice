package logicalletcode;

import java.util.HashMap;
import java.util.Map;

class Two_Sum {
    public static void main(String[] args) {
        Two_Sum out = new Two_Sum();
        Solution s = out.new Solution();
        int[] a = {2, 7, 11, 15};
        int target = 9;
        int[] result = s.two_sum(a, target);
        for (int each : result) {
            System.out.println(each);

        }
    }

    public class Solution {
        public int[] two_sum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    int other_index = hm.get(nums[i]);
                    return new int[]{Math.min(i, other_index) + 1, Math.max(i, other_index) + 1};
                }else hm.put(target-nums[i],i);
            }
            return null;
        }

    }
    class solution{
        public int[] two_sum(int[] nums, int target) {
            Map<Integer,Integer> m = new HashMap<>();
            for(int i = 0;;++i){
                int x = nums[i];
                int y = target-x;
                if(m.containsKey(y)){
                    return  new int[] {m.get(y),i};
                }
                m.put(x,i);

            }        }
    }

}
