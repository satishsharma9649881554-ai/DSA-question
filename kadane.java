public class kadane {
    public static int kadanes(int nums[]){
        int n  = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){   //o(n) and o(1)
            currSum += nums[i];

            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0){
                currSum = 0;
            }

        }
        return maxSum;
    }

     public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = kadanes(nums);
        System.out.println(result);
     }
}





