class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        // Step 1: Calculate left products
        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            output[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        // Step 2: Calculate right products
        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return output;
    }
}