public class singlenumber {
    public static int singlenumber(int nums[]){
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++){  //o(n) and space comp o(1)
             ans ^= nums[i];


        }
         return ans;
    }
    public static void main(String args[]){
        int nums [] = {2,2,3,4,4,5,3};
        System.out.println(singlenumber(nums));
    }
   
}
