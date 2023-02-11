class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] cNums = nums.clone();
        
        Arrays.sort(cNums);
        
        int[] result = new int[nums.length];
        
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < result.length; i++) {
            
            if(!values.containsKey(cNums[i])) {
                
                values.put(cNums[i], i);
                
            }
            
        }
        
        for (int i = 0; i < result.length; i++) {
            
            result[i] = values.get(nums[i]);
            
        }
        
        return result;  
        
    }
}