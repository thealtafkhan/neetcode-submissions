class Solution {
    //method for checking array has a duplicate number or not 
    public boolean hasDuplicate(int[] nums) {
    
    HashSet<Integer>set= new HashSet<>();

    for(int num : nums){

        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false; 
    }
}