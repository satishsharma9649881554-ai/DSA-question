public class nextpermutation {
    public static void permutation(int nums[]){
        int n = nums.length;
        int piv = -1;
        //pivot
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                piv = i;
                break;
            }
            
           
        }
        if(piv == -1){ //[5,4,3,2,1]
                int left = 0;
                int right = n-1;
                 while(left<right){
                    int temp =nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                    
                 }  
                 return;
                
            }
               for(int i=n-1; i>piv; i--){
                if(nums[i]> nums[piv]){
                 int   temp = nums[i];
                 nums[i] = nums[piv];
                 nums[piv] = temp;
                 break;

                }
            }

            int start = piv + 1;
            int end = n-1;
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] =- temp;
                start++;
                end--;
            }
        
    }
public static void main(String[] args) {
    int[] nums = {5,4,3,2,1};
    permutation(nums);
   for(int x : nums){
    System.out.print(x + "");
   }
    
}
    
}
