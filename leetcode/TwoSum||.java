//runtime:O(n)
//spacetime:O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
  int n = nums.length;
  int i = 0, j = n - 1;
  
  while (i < j) {
    int val = nums[i] + nums[j];
    if (val == target) {
      return new int[] { i + 1, j + 1 };
    } else if (val < target) {
      i += 1;
    } else { // val > target
      j -= 1;
    }
  }
  
  throw new IllegalArgumentException();
}

}

//runtime: O(n)
//spacetime;O(n)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length < 2){
           return new int[]{-1,-1};
       }
        int [] res = new int [] {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                res[0] = map.get(target-numbers[i])+1;
                res[1] = i+1;
                break;
            }
            map.put(numbers[i],i);
        }
        return res;
        
    }
}