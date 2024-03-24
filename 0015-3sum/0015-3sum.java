class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i - 1] == nums[i]) { // nu folosim acelasi numar
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);  
                    a.add(nums[left]);
                    a.add(nums[right]);
                    result.add(a);
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++; 
                    }
                } 
            }     
        }
        return result;
    }
}