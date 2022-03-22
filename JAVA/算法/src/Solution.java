import java.util.Scanner;

class Solution3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[6];
        int[] res = new int[2];
        for (int i = 0;i<6;i++)
            nums[i] = input.nextInt();
        int target = input.nextInt();
        res[0] = leftSearch(nums,target);
        res[1] = rightSearch(nums,target);
        System.out.println("["+res[0]+','+res[1]+']');
    }

    private static int leftSearch(int[] nums, int target){
        if(nums==null||nums.length==0) return -1;

        int l=0,r=nums.length-1;
        while(l+1<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target){
                l=mid;
            }
            else{
                r=mid;
            }
        }
        if(nums[l]==target) return l;
        if(nums[r]==target) return r;

        return -1;
    }

    private static int rightSearch(int[] nums, int target){
        if(nums==null||nums.length==0) return -1;

        int l=0,r=nums.length-1;
        while(l+1<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<=target){
                l=mid;
            }
            else{
                r=mid;
            }
        }
        if(nums[r]==target) return r;
        if(nums[l]==target) return l;

        return -1;
    }
}

