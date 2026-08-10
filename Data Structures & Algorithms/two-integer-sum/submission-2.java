class Solution {
    //brute force
    public int[] twoSum(int[] nums, int target) {
        
        int[] Output = new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    Output[0]=i;
                    Output[1]=j;
                }
            }
        }
        return Output; 
    }
}
