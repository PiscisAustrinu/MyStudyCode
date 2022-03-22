import java.util.HashMap;
import java.util.Map;

public class TowSumAdd {
    /**
     * 暴力枚举法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for (int i = 0;i<n;++i){
            for (int j = i+1;j<n;++j){
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
    public int[] twoSumHashtable(int[] nums,int target){
        Map<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
        for (int i = 0;i<nums.length;++i){
            if (hashtable.containsKey(target-nums[i])){
                return new int[] {hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int target = 5;
        TowSumAdd towSumAdd = new TowSumAdd();
        int[] twoSum = towSumAdd.twoSum(nums, target);
        System.out.println("暴力枚举这两个数是："+twoSum[0]+" "+twoSum[1]);
        TowSumAdd towSumAdd1 = new TowSumAdd();
        int[] twoSumHashtable = towSumAdd1.twoSumHashtable(nums, 4);
        System.out.println("哈希表得到的结果："+twoSumHashtable[0]+" "+twoSumHashtable[1]);
    }
}
