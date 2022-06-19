class 1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] myArr = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length && i!=j; j++){
                if (nums[i] + nums[j] == target){
                    myArr[0] = i;
                    myArr[1] = j;
                    break;   
                }
            }
        }
        return myArr;
    }
}