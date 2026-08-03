public class majority {
    public static int majority(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){  //o(n^2) time complexity , space compxity 0(1) not use any hash array etc.
                if(nums[i] == nums[j]){  
                    count++;

                }
            }
            if(count > n/2){
                return count;
            }
        }
        return -1;
    }
    public static int major(int nums[]){
        int n = nums.length;
        int freq = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(freq == 0){
                ans = nums[i];
            }
         if(ans == nums[i]){
            freq++;
         }else{
             freq--;
             }
      
        }
          return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        int result = majority(nums);
        int result1 = major(nums);
        System.out.println(result1);
    }
}


